package com.karurmallow.demotestingapp.services

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface MAApiRequest {
    companion object{
        private const val MOVIE_END_POINT ="/3/movie/top_rated?api_key=f6a7fd2ad2e174eb8aada2b4fc11a8e4"
    }

    @GET(MOVIE_END_POINT)
    @Headers("Accept:application/json")
    fun fetchMovieFromServer(@Query("language") language: String, @Query("page") page: Int): Call<ResponseBody>
}