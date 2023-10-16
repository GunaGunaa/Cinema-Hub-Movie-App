package com.karurmallow.demotestingapp.common

import com.karurmallow.demotestingapp.model.MAMovieDetails

interface MAServerCallBack {
    fun onSuccess(movieResponse: MAMovieDetails, userLanguage: String, pageNumber: Int)
    fun onFailure(error: String)
    fun onNetworkFailure()
}