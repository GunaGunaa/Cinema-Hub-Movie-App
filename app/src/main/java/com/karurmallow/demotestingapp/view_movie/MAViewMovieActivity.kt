package com.karurmallow.demotestingapp.view_movie

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.karurmallow.demotestingapp.R
import com.karurmallow.demotestingapp.common.MABaseActivity
import com.karurmallow.demotestingapp.common.MAConstant
import com.karurmallow.demotestingapp.common.MAConstant.KEY_MOVIE
import com.karurmallow.demotestingapp.common.MAConstant.TIME_DELAY
import com.karurmallow.demotestingapp.common.MANetworkMonitor
import com.karurmallow.demotestingapp.databinding.MaActivityViewMovieBinding
import com.karurmallow.demotestingapp.model.MAMovieResults
import com.karurmallow.demotestingapp.movie_list.MAMovieListActivity
import java.util.*

@Suppress("DEPRECATION")
class MAViewMovieActivity : MABaseActivity() {
    private lateinit var crash:String
    private lateinit var viewMovieBinding: MaActivityViewMovieBinding
    private val viewMovieViewModel: MAViewMovieViewModel by lazy { ViewModelProvider(this)[MAViewMovieViewModel::class.java] }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewMovieBinding = MaActivityViewMovieBinding.inflate(layoutInflater)
        setContentView(viewMovieBinding.root)
        setClickListner()
        networkMonitor()
        loadMovie()
    }

    @SuppressLint("SetTextI18n")
    private fun loadMovie() {
        viewMovieViewModel.movie = intent.getSerializableExtra(KEY_MOVIE) as MAMovieResults //have to
        /**Set movie View*/
        viewMovieBinding.apply {
            viewMovieViewModel.movie.let {
                tvMovieName.text = it.movieTitle?.uppercase(Locale.getDefault())
                tvTitle.text = it.movieTitle
                tvMovieData.text = it.movieReleaseDate
                tvMovieLanguage.text = it.movieLanguage?.uppercase(Locale.getDefault())
                tvRating.text = it.movieAverageVote.toString()
                tvTotalReviews.text = "(${it.movieVoteCount})"
                tvMovieDescriptions.text = it.movieDescription
                /**set movie poster using Glide library*/
                Glide.with(this@MAViewMovieActivity)
                    .load("${MAConstant.IMAGE_BASE_URL}${it.moviePosterEndPont}").fitCenter()
                    .skipMemoryCache(true)
                    .error(R.drawable.iv_network_error)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(ivMoviePoster)
            }
        }
    }

    private fun setClickListner() {
        viewMovieBinding.ivBackArrow.setOnClickListener { navigateToMovieList() }
        viewMovieBinding.tvTitle.setOnClickListener {
            Log.d("Msg123",crash)
        }
    }

    private fun networkMonitor() {
        MANetworkMonitor(application).observe(this) {
            viewMovieViewModel.networkState = it
            networkBanner(it)
        }
        if (!viewMovieViewModel.networkState) networkBanner(false)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        navigateToMovieList()
    }

    private fun navigateToMovieList() {
        startActivity(Intent(this@MAViewMovieActivity, MAMovieListActivity::class.java))
        finish()
    }

    private fun networkBanner(networkState: Boolean) {
        if (!networkState) {
            viewMovieBinding.tvNetworkState.text = getString(R.string.no_internet)
            viewMovieBinding.clNetworkBanner.let {
                it.visibility = View.VISIBLE
                it.setBackgroundResource(R.color.red)
                Handler().postDelayed({
                    it.setBackgroundResource(R.color.liteGray)
                }, TIME_DELAY)
            }
        } else {
            viewMovieBinding.tvNetworkState.text = getString(R.string.internet_connected)
            viewMovieBinding.clNetworkBanner.let {
                it.visibility = View.VISIBLE
                it.setBackgroundResource(R.color.green)
                Handler().postDelayed({
                    it.visibility = View.GONE
                }, TIME_DELAY)
            }
        }
    }
}