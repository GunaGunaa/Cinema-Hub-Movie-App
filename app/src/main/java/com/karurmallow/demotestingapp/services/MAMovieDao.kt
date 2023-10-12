package com.karurmallow.demotestingapp.services

import androidx.room.*
import com.karurmallow.demotestingapp.model.MAMovieResults

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@Dao
interface MAMovieDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveMovies(movies: MAMovieResults)

    @Query("DELETE FROM moviesTable WHERE userLanguage = :userLanguage")
    fun clearMovies(userLanguage:String)

    @Transaction
    @Query("SELECT * FROM moviesTable WHERE userLanguage= :userLanguage AND pageNumber=:pageNumber " +
            "ORDER BY " +
            "CASE WHEN :order=0 THEN movieTitle END ASC," +
            "CASE WHEN :order=1 THEN movieTitle END DESC")
    fun retrieveMoviesByPageNumber(userLanguage: String, pageNumber: Int, order:Int) : MutableList<MAMovieResults>

    @Transaction
    @Query("SELECT * FROM moviesTable  WHERE userLanguage= :userLanguage " +
            "ORDER BY pageNumber  ASC, movieTitle  ASC")
    fun retrieveMoviesByAscendingOrder(userLanguage: String) : MutableList<MAMovieResults>

    @Transaction
    @Query("SELECT * FROM moviesTable  WHERE userLanguage= :userLanguage ORDER BY  " +
            " pageNumber  ASC, movieTitle  DESC")
    fun retrieveMoviesByDescendingOrder(userLanguage: String) : MutableList<MAMovieResults>

    @Transaction
    @Query("SELECT * FROM moviesTable WHERE movieTitle LIKE '%' || :searchKey || '%' AND userLanguage=:userLanguage " +
            "ORDER BY " +
            "CASE WHEN :order=0 THEN movieTitle END ASC," +
            "CASE WHEN :order=1 THEN movieTitle END DESC")
    fun retrieveMovieBySearchKey(searchKey:String,userLanguage: String,order:Int) : MutableList<MAMovieResults>
}