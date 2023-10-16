package com.karurmallow.demotestingapp.repository.remote

import com.karurmallow.demotestingapp.common.MAServerCallBack
import com.karurmallow.demotestingapp.services.MAApiRequest
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object MAApiManager {
    private const val MOVIE_BASE_URL = "https://api.themoviedb.org"
    private val logger : HttpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    private val retrofit by lazy {
        Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(logger).build())
    }
    private val movieClient: MAApiRequest by lazy { retrofit.baseUrl(MOVIE_BASE_URL).build().create(
        MAApiRequest::class.java) }

    fun getMovieList(movieLanguage: String, page: Int, internet:Boolean, response: MAServerCallBack, callBack: Callback<ResponseBody>){
        movieClient.fetchMovieFromServer(movieLanguage,page).let {
            request(it, callBack,response,internet)
        }
    }

    private fun request(call: Call<ResponseBody>, callBack: Callback<ResponseBody>, response: MAServerCallBack, internet: Boolean) {
        if (!internet)response.onNetworkFailure()
        else call.enqueue(callBack)
    }
}