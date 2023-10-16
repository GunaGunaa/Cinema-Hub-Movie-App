package com.karurmallow.demotestingapp.movie_list

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.karurmallow.demotestingapp.R
import com.karurmallow.demotestingapp.common.MAConstant.IMAGE_BASE_URL
import com.karurmallow.demotestingapp.databinding.MaAdapterMovieCellBinding
import com.karurmallow.demotestingapp.model.MAMovieResults

@Suppress("DEPRECATION")
class MAMovieListAdapter(private val context: Context,private val returnMovie:(MAMovieResults)->Unit) : RecyclerView.Adapter<MAMovieListAdapter.MAMovieViewHolder>() {

    private var movieList:MutableList<MAMovieResults> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MAMovieViewHolder {
        return MAMovieViewHolder(MaAdapterMovieCellBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(movieHolder: MAMovieViewHolder, position: Int) {
        val adapterPosition = movieHolder.adapterPosition
        if (adapterPosition<movieList.size){
            val movie = movieList[adapterPosition]
            movieHolder.movieCellBinding.apply {
                tvMovieName.text = movie.movieTitle
                tvMovieData.text = movie.movieReleaseDate
                tvMovieDescriptions.text = movie.movieDescription
                /**set movie poster by using Glide library*/
                Glide.with(context)
                    .load("$IMAGE_BASE_URL${movie.moviePosterEndPont}").fitCenter()
                    .skipMemoryCache(true)
                    .error(R.drawable.iv_network_error)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(ivMoviePoster)
                /**selected movie send to MAMovieListActivity*/
                clMovieDetails.setOnClickListener { returnMovie(movie) }
            }
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    inner class MAMovieViewHolder(val movieCellBinding: MaAdapterMovieCellBinding): RecyclerView.ViewHolder(movieCellBinding.root)

    @SuppressLint("NotifyDataSetChanged")
    fun updateMovieList(newMovies: MutableList<MAMovieResults>) {
        movieList.addAll(newMovies)
        notifyDataSetChanged()
    }
}
