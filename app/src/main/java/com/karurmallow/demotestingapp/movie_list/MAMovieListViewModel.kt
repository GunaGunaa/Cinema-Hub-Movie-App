package com.karurmallow.demotestingapp.movie_list

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.google.firebase.perf.FirebasePerformance
import com.google.firebase.perf.metrics.Trace
import com.karurmallow.demotestingapp.common.MAConstant.ARABIC
import com.karurmallow.demotestingapp.common.MAConstant.AR_BH
import com.karurmallow.demotestingapp.common.MAConstant.ENGLISH
import com.karurmallow.demotestingapp.common.MAConstant.EN_US
import com.karurmallow.demotestingapp.common.MAConstant.ERROR_TAG
import com.karurmallow.demotestingapp.common.MAConstant.HINDI
import com.karurmallow.demotestingapp.common.MAConstant.HI_IN
import com.karurmallow.demotestingapp.common.MAConstant.JAPANESE
import com.karurmallow.demotestingapp.common.MAConstant.JA_JP
import com.karurmallow.demotestingapp.common.MAConstant.THAI
import com.karurmallow.demotestingapp.common.MAConstant.TH_TH
import com.karurmallow.demotestingapp.common.MAServerCallBack
import com.karurmallow.demotestingapp.model.MAMovieDetails
import com.karurmallow.demotestingapp.model.MAMovieResults


/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
class MAMovieListViewModel(application: Application) : AndroidViewModel(application) {
    var networkFlag=0
    var networkState :Boolean= false
    var selectedLanguage =EN_US
    var selectPageNumber: Int = 1
    var movieListLiveData:MutableLiveData<MutableList<MAMovieResults>> = MutableLiveData()
    var searchMovieListLiveData:MutableLiveData<MutableList<MAMovieResults>> = MutableLiveData()
    var filterOrderMovieListLiveData:MutableLiveData<MutableList<MAMovieResults>> = MutableLiveData()
    var movieListSize:Int=0
    var movieListOrder:Int=0
    var previousPage=0

    fun setMovieOrder(){
        /**0 -> Ascending order
         * 1 -> Descending order*/
        movieListOrder = if (movieListOrder==1) 0
        else 1
        retrieveOrderFilterMovie(0)
    }

    fun setLanguage(language: String) {
        when (language) {
            /** use case describe at bellow*/
            ENGLISH -> resetPageNumber(EN_US)
            ARABIC -> resetPageNumber(AR_BH)
            THAI -> resetPageNumber(TH_TH)
            HINDI -> resetPageNumber(HI_IN)
            JAPANESE -> resetPageNumber(JA_JP)
        }
    }

    /**
     * it will reset the page when newly selected language is not equal to previously selected language
     */
    private fun resetPageNumber(language: String) {
        if (language != selectedLanguage) {
            selectedLanguage=language
            selectPageNumber = 1
            previousPage=0
            movieListSize=0
            networkFlag=0
            refreshServer()
        }
    }

    fun fetchMoviesFromServer(){
        if (previousPage!=selectPageNumber) {
            previousPage=selectPageNumber
            MAMovieListRepository.fetchMovieFromServer(selectedLanguage, selectPageNumber, networkState, object :
                MAServerCallBack {
                    override fun onSuccess(
                        movieResponse: MAMovieDetails,
                        userLanguage: String,
                        pageNumber: Int
                    ) {
                        /**
                         * movies fetch success fully from server
                         * handle database for save && fetch movies
                         */
                        dataBaseHandle(movieResponse, userLanguage, pageNumber)
                    }

                    override fun onFailure(error:String) {
                        Log.d(ERROR_TAG,error)
                    }

                    override fun onNetworkFailure() {
                        if (movieListSize == 0) {
                            retrieveMovie(selectedLanguage, 0)
                        }
                    }
                })
        }
    }

    private fun dataBaseHandle(movieResponse: MAMovieDetails, userLanguage: String, pageNumber: Int) {
        /**
         * clear old movies of current language in DB
         */
        MAMovieListRepository.clearMoviesInDB(userLanguage,pageNumber,object : MADataBaseCallBack {
            override fun dataBaseResponse() {
                /**
                 * save newly fetch movie from server
                 */
                    MAMovieListRepository.saveMoviesInDataBase(movieResponse,userLanguage,pageNumber,object :
                        MADataBaseCallBack {
                        override fun dataBaseResponse() {
                            /**
                             * retrieve movie from DB
                             */
                            retrieveMovie(userLanguage,pageNumber)
                        }
                    })
            }
        })
    }

    private fun retrieveMovie(userLanguage: String, pageNumber: Int) {
        MAMovieListRepository.retrieveMoviesFromDB(userLanguage,pageNumber,movieListOrder,object :
            MARetrieveMovieCallBack {
            override fun fetchMovieFromDB(movieList: MutableList<MAMovieResults>) {
                if (networkState){
                    selectPageNumber++
                    movieListSize += movieList.size
                }
                movieListLiveData.postValue(movieList)
            }
        })
    }

    fun retrieveMovieBySearchQuery(searchKey:String){
        MAMovieListRepository.retrieveMovieBySearchFromDB(selectedLanguage,searchKey,movieListOrder,object :
            MARetrieveMovieCallBack {
            override fun fetchMovieFromDB(movieList: MutableList<MAMovieResults>) {
                searchMovieListLiveData.postValue(movieList)
            }
        })
    }

    fun retrieveOrderFilterMovie(pageNumber: Int) {
        MAMovieListRepository.retrieveMoviesFromDB(selectedLanguage,pageNumber,movieListOrder,object :
            MARetrieveMovieCallBack {
            override fun fetchMovieFromDB(movieList: MutableList<MAMovieResults>) {
                filterOrderMovieListLiveData.postValue(movieList)
            }
        })
    }

    fun refreshServer(){
        selectPageNumber = 1
        movieListSize=0
        previousPage=0
        fetchMoviesFromServer()
    }

    fun clearAll(){
        networkFlag=0
        networkState = false
        selectedLanguage =EN_US
        selectPageNumber = 1
        movieListLiveData = MutableLiveData()
        searchMovieListLiveData = MutableLiveData()
        movieListSize=0
        movieListOrder=0
    }
}

interface MARetrieveMovieCallBack {
    fun fetchMovieFromDB(movieList: MutableList<MAMovieResults>)
}

interface MADataBaseCallBack {
    fun dataBaseResponse()
}