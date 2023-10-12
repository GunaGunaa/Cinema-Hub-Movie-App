package com.karurmallow.demotestingapp.model

import com.google.gson.annotations.SerializedName

data class MAMovieDetails(
    @SerializedName("results")
    val moviesList: List<MAMovieResults>,
)
