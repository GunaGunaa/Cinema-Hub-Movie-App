package com.karurmallow.demotestingapp.view_movie

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.karurmallow.demotestingapp.model.MAMovieResults

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
class MAViewMovieViewModel(application: Application) : AndroidViewModel(application) {
    var networkState: Boolean = false
    lateinit var movie: MAMovieResults
}