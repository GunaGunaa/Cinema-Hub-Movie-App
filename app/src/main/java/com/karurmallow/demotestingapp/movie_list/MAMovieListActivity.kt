package com.karurmallow.demotestingapp.movie_list

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.perf.FirebasePerformance
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.karurmallow.demotestingapp.R
import com.karurmallow.demotestingapp.common.MABaseActivity
import com.karurmallow.demotestingapp.common.MAConstant.KEY_MOVIE
import com.karurmallow.demotestingapp.common.MAConstant.TIME_DELAY
import com.karurmallow.demotestingapp.common.MANetworkMonitor
import com.karurmallow.demotestingapp.common.toastMessage
import com.karurmallow.demotestingapp.databinding.MaActivityMovieListBinding
import com.karurmallow.demotestingapp.model.MAMovieResults
import com.karurmallow.demotestingapp.view_movie.MAViewMovieActivity
import io.sentry.Sentry


@Suppress("UNUSED_EXPRESSION", "DEPRECATION")
class MAMovieListActivity : MABaseActivity() {
    private lateinit var sentryTest:String
    private lateinit var analytic: FirebaseAnalytics
    private lateinit var movieListAdapter: MAMovieListAdapter
    private val movieListViewModel: MAMovieListViewModel by lazy { ViewModelProvider(this)[MAMovieListViewModel::class.java] }
    private lateinit var movieListBinding: MaActivityMovieListBinding
    private lateinit var firebasePerformance: com.google.firebase.perf.metrics.Trace
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieListBinding = MaActivityMovieListBinding.inflate(layoutInflater)
        setContentView(movieListBinding.root)
        analytic = FirebaseAnalytics.getInstance(this)
        firebasePerformance = FirebasePerformance.getInstance().newTrace("fcm_token")
        movieListBinding.ivMovieListOrderFilter.setImageResource(R.drawable.ic_ascending_order)
        //setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_ascending_order))
        sentry()
        viewModelObservers()
        listeners()
        remoteConfig()
        firebasePerformance.start()
        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w("Msg123", "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }
            // Get new FCM registration token
            val token = task.result
            firebasePerformance.putAttribute("fcmKey",token.toString())

            Log.d("Msg123", token.toString())
        })
        firebasePerformance.stop()
    }

    private fun sentry() {
//        try {
//            Log.d("Msg123",sentryTest)
//        }catch (e:Exception){
//            Sentry.captureException(e)
//        }
    }

    private fun remoteConfig() {
        val remoteConfig = Firebase.remoteConfig
        val configSettings = remoteConfigSettings {
            minimumFetchIntervalInSeconds = 36
        }
        remoteConfig.setConfigSettingsAsync(configSettings)
        remoteConfig.fetchAndActivate().addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    //val updated = task.result
                    //val boolean = Firebase.remoteConfig.getString("background_colour")
                    //movieListBinding.clMain.setBackgroundColor((Color.parseColor(boolean)))
                }
            }
    }

    private fun viewModelObservers() {
        retrieveMovieObserver()
        retrieveSearchMovieObserver()
        retrieveOrderFilterMovieObserver()
    }

    private fun listeners() {
        searchViewListener()
        pullRefreshListener()
        recyclerViewListener()
        networkListener()
        setClickListener()
    }

    private fun retrieveOrderFilterMovieObserver() {
        movieListViewModel.filterOrderMovieListLiveData.observe(this) {
            setMovieAdapter(it, true)
        }
    }

    private fun retrieveSearchMovieObserver() {
        movieListViewModel.searchMovieListLiveData.observe(this) {
            setMovieAdapter(it, true)
        }
    }

    private fun retrieveMovieObserver() {
        movieListViewModel.movieListLiveData.observe(this) {
            userInteraction(true)
            if (movieListBinding.slRefresher.isRefreshing) movieListBinding.slRefresher.isRefreshing = false
            setMovieAdapter(it, false)
        }
    }

    private fun networkListener() {
        MANetworkMonitor(application).observe(this) {
            movieListViewModel.networkState = it
            networkStatusBanner(it)
            /**If application get network first time,
             *it will refresh the server,
             *change network flag to 0 .
             */
            if (movieListViewModel.networkFlag == 0 && it) {
                movieListViewModel.refreshServer()
                movieListViewModel.networkFlag = 1
            }
            /**If network get after disconnect,
             *it will refresh the server
             */
            if (movieListViewModel.selectPageNumber != 1 && it) movieListViewModel.refreshServer()
        }
        /**If initially consider no network and fetch movie from DB*/
        if (!movieListViewModel.networkState) {
            fetchMovies()
            networkStatusBanner(false)
        }
    }

    private fun fetchMovies() {
        userInteraction(false)
        movieListViewModel.fetchMoviesFromServer()
    }

    /**Sent movie list to adapter class*/
    private fun setMovieAdapter(
        receivedMovieList: MutableList<MAMovieResults>, isFilterQuery: Boolean
    ) {
        /**when ever user user search view or selected pg.no=1,2
         *reinitialize the movie list adapter
         */
        if (movieListViewModel.selectPageNumber <= 2 || isFilterQuery) {
            if (receivedMovieList.size != 0) movieListBinding.tvMovieUnavailable.visibility =
                View.GONE
            else movieListBinding.tvMovieUnavailable.visibility = View.VISIBLE
            movieListAdapter = MAMovieListAdapter(application) { navigateToViewMovie(it) }
            movieListBinding.rvMovieList.adapter = movieListAdapter
            movieListBinding.rvMovieList.layoutManager = LinearLayoutManager(this)
        }
        if (this::movieListAdapter.isInitialized) movieListAdapter.updateMovieList(receivedMovieList)
    }

    private fun pullRefreshListener() {
        movieListBinding.slRefresher.setOnRefreshListener {
            if (movieListViewModel.networkState) {
                movieListViewModel.refreshServer()
            } else {
                if (movieListBinding.slRefresher.isRefreshing) movieListBinding.slRefresher.isRefreshing =
                    false
            }
        }
    }

    /** pagination logics */
    private fun recyclerViewListener() {
        movieListBinding.rvMovieList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val position =
                    (recyclerView.layoutManager as LinearLayoutManager).findLastCompletelyVisibleItemPosition()
                if (position == movieListViewModel.movieListSize - 1 && movieListViewModel.networkState) {
                    userInteraction(false)
                    movieListViewModel.fetchMoviesFromServer()
                }
            }
        })
    }

    private fun setClickListener() {
        movieListBinding.ivFilterLanguage.setOnClickListener {
            showPopMenu(it)
        }
        movieListBinding.ivMovieListOrderFilter.setOnClickListener { sortingFilter() }
    }

    private fun sortingFilter() {
        if (movieListViewModel.movieListOrder == 0) {
            movieListBinding.ivMovieListOrderFilter.setImageResource(R.drawable.ic_descending_order)
            //setImageDrawable(ContextCompat.getDrawable(this@MAMovieListActivity, R.drawable.ic_descending_order))
        } else {
            movieListBinding.ivMovieListOrderFilter.setImageResource(R.drawable.ic_ascending_order)
            //setImageDrawable(ContextCompat.getDrawable(this@MAMovieListActivity, R.drawable.ic_ascending_order))
        }
        movieListViewModel.setMovieOrder()

    }

    private fun searchViewListener() {
        movieListBinding.svMovie.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean = false
            override fun onQueryTextChange(newText: String?): Boolean {
                /**sent search key to DB*/
                movieListViewModel.retrieveMovieBySearchQuery(newText.toString())
                if (newText.isNullOrEmpty()) {
                    movieListViewModel.retrieveOrderFilterMovie(0)
                }
                return false
            }
        })
    }

    /**
     * Initializing the popup menu and giving the reference as current context
     */
    @SuppressLint("SuspiciousIndentation", "InvalidAnalyticsName")
    private fun showPopMenu(view: View) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(this@MAMovieListActivity)
        firebaseAnalytics.let {
            it.setAnalyticsCollectionEnabled(true)
        }
        val bundle = Bundle()
        val popupMenu = PopupMenu(this@MAMovieListActivity, view)
        popupMenu.menuInflater.inflate(R.menu.language_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener {
            toastMessage(it.toString())
            //bundle.putString("selected_language", it.toString())
            firebaseAnalytics.logEvent("language_selected") {
                param("selected_language", "$it")
            }
            movieListViewModel.setLanguage(it.toString())
            true
        }
        popupMenu.show()
    }

    /**
     * Received selected movie from movie list &&
     * navigate to next screen(MAViewMovieActivity)
     */
    private fun navigateToViewMovie(selectedMovie: MAMovieResults) {
        val viewMovieIntent = Intent(this, MAViewMovieActivity::class.java)
        viewMovieIntent.putExtra(KEY_MOVIE, selectedMovie)
        startActivity(viewMovieIntent)
        finish()
    }

    private fun userInteraction(isAllowed: Boolean) {
        if (isAllowed) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
            movieListBinding.clProgressBar.visibility = View.GONE
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
            )
            movieListBinding.clProgressBar.visibility = View.VISIBLE
        }
    }

    private fun networkStatusBanner(networkState: Boolean) {
        if (!networkState) {
            movieListBinding.tvNetworkState.text = getString(R.string.no_internet)
            movieListBinding.clNetworkBanner.let {
                it.visibility = View.VISIBLE
                it.setBackgroundResource(R.color.red)
                Handler().postDelayed({ it.setBackgroundResource(R.color.liteGray) }, TIME_DELAY)
            }
        } else {
            movieListBinding.tvNetworkState.text = getString(R.string.internet_connected)
            movieListBinding.clNetworkBanner.let {
                it.visibility = View.VISIBLE
                it.setBackgroundResource(R.color.green)
                Handler().postDelayed({ it.visibility = View.GONE }, TIME_DELAY)
            }
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        exitDialogBox()
    }

    private fun exitDialogBox() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setMessage(R.string.exit_message).setCancelable(false)
            .setPositiveButton(R.string.yes,
                DialogInterface.OnClickListener { _, _ -> super.onBackPressed() })
            .setNegativeButton(R.string.no,
                DialogInterface.OnClickListener { dialog, _ -> dialog.cancel() })
        val exitAlertDialogBox: AlertDialog = builder.create()
        exitAlertDialogBox.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        movieListViewModel.clearAll()
    }
}