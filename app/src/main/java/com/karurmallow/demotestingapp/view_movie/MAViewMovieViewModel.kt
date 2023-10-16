package com.karurmallow.demotestingapp.view_movie

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.karurmallow.demotestingapp.model.MAMovieResults


class MAViewMovieViewModel(application: Application) : AndroidViewModel(application) {
    var networkState: Boolean = false
    lateinit var movie: MAMovieResults
}