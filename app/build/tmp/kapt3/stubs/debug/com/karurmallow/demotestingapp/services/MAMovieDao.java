package com.karurmallow.demotestingapp.services;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/karurmallow/demotestingapp/services/MAMovieDao;", "", "clearMovies", "", "userLanguage", "", "retrieveMovieBySearchKey", "", "Lcom/karurmallow/demotestingapp/model/MAMovieResults;", "searchKey", "order", "", "retrieveMoviesByAscendingOrder", "retrieveMoviesByDescendingOrder", "retrieveMoviesByPageNumber", "pageNumber", "saveMovies", "movies", "app_debug"})
public abstract interface MAMovieDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void saveMovies(@org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.model.MAMovieResults movies);
    
    @androidx.room.Query(value = "DELETE FROM moviesTable WHERE userLanguage = :userLanguage")
    public abstract void clearMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM moviesTable WHERE userLanguage= :userLanguage AND pageNumber=:pageNumber ORDER BY CASE WHEN :order=0 THEN movieTitle END ASC,CASE WHEN :order=1 THEN movieTitle END DESC")
    @androidx.room.Transaction()
    public abstract java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults> retrieveMoviesByPageNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int pageNumber, int order);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM moviesTable  WHERE userLanguage= :userLanguage ORDER BY pageNumber  ASC, movieTitle  ASC")
    @androidx.room.Transaction()
    public abstract java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults> retrieveMoviesByAscendingOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM moviesTable  WHERE userLanguage= :userLanguage ORDER BY   pageNumber  ASC, movieTitle  DESC")
    @androidx.room.Transaction()
    public abstract java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults> retrieveMoviesByDescendingOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM moviesTable WHERE movieTitle LIKE \'%\' || :searchKey || \'%\' AND userLanguage=:userLanguage ORDER BY CASE WHEN :order=0 THEN movieTitle END ASC,CASE WHEN :order=1 THEN movieTitle END DESC")
    @androidx.room.Transaction()
    public abstract java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults> retrieveMovieBySearchKey(@org.jetbrains.annotations.NotNull()
    java.lang.String searchKey, @org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int order);
}