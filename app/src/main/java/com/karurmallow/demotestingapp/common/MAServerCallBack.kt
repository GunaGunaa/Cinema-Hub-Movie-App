package com.karurmallow.demotestingapp.common

import com.karurmallow.demotestingapp.model.MAMovieDetails

/**
 * Created by Gowthamchandran.R on 26/11/2022
 */
interface MAServerCallBack {
    fun onSuccess(movieResponse: MAMovieDetails, userLanguage: String, pageNumber: Int)
    fun onFailure(error: String)
    fun onNetworkFailure()
}