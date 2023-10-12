@file:Suppress("DEPRECATION")

package com.karurmallow.demotestingapp.movie_list

import android.os.AsyncTask
import com.google.firebase.perf.FirebasePerformance
import com.google.firebase.perf.metrics.Trace
import com.karurmallow.demotestingapp.common.MAApplication
import com.karurmallow.demotestingapp.common.MAServerCallBack
import com.karurmallow.demotestingapp.model.MAMovieDetails
import com.karurmallow.demotestingapp.model.MAMovieResults
import com.karurmallow.demotestingapp.repository.local.MADataBaseManager
import com.karurmallow.demotestingapp.repository.remote.MAApiManager
import com.google.gson.Gson
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
object MAMovieListRepository {
    private val daoHelper: MADataBaseManager by lazy { MAApplication.appInstance.moviesDataBaseInstance }
    fun fetchMovieFromServer(userLanguage: String, pageNumber: Int,internet:Boolean, serverResponseCallBack: MAServerCallBack) {
        MAApiManager.getMovieList(userLanguage, pageNumber,internet,serverResponseCallBack,
        object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>, ) {
                if (response.isSuccessful && response.code()==200){
                    val movieResponse = Gson().fromJson(response.body()?.string(), MAMovieDetails::class.java)
                    serverResponseCallBack.onSuccess(movieResponse,userLanguage,pageNumber)
                }
                else serverResponseCallBack.onFailure(response.message())
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                serverResponseCallBack.onFailure(t.toString())
            }
        })
    }

    fun clearMoviesInDB(userLanguage: String, pageNumber: Int, callBack: MADataBaseCallBack) {
        if (pageNumber==1){
           AsyncTask.execute{
                daoHelper.userDao().clearMovies(userLanguage)
                callBack.dataBaseResponse()
            }
        }else callBack.dataBaseResponse()
    }

    fun saveMoviesInDataBase(movieResponse: MAMovieDetails, userLanguage: String, pageNumber: Int, callBack: MADataBaseCallBack) {
        for (position in 0 until movieResponse.moviesList.size) {
            movieResponse.moviesList[position].let {
                AsyncTask.execute {
                    daoHelper.userDao().saveMovies(
                        MAMovieResults(0,
                            userLanguage,
                            pageNumber,
                            it.posterEndPoint,
                            it.movieId,
                            it.movieLanguage,
                            it.movieTitle,
                            it.movieDescription,
                            it.moviePosterEndPont,
                            it.movieReleaseDate,
                            it.movieAverageVote,
                            it.movieVoteCount)
                    )
                }
            }
        }
        callBack.dataBaseResponse()
    }

    fun retrieveMoviesFromDB(userLanguage: String, pageNumber: Int, filterOrder:Int, callBack: MARetrieveMovieCallBack){
        /**
         * page number 0-> handle offline scenario - 'consider app start first time'
         * page number not = 0 online scenario
         */

        if (pageNumber==0){
            AsyncTask.execute {
                if (filterOrder==0) callBack.fetchMovieFromDB(daoHelper.userDao().retrieveMoviesByAscendingOrder(userLanguage) )
                else callBack.fetchMovieFromDB(daoHelper.userDao().retrieveMoviesByDescendingOrder(userLanguage) )
            }
        }
        if (pageNumber!=0){
            AsyncTask.execute{
                callBack.fetchMovieFromDB(daoHelper.userDao().retrieveMoviesByPageNumber(userLanguage,pageNumber,filterOrder) )
            }
        }
    }

    fun retrieveMovieBySearchFromDB(userLanguage: String, searchKey:String, order: Int, callBack: MARetrieveMovieCallBack){
        Thread {
            callBack.fetchMovieFromDB(daoHelper.userDao().retrieveMovieBySearchKey(searchKey,userLanguage,order))
        }.start()
    }
}