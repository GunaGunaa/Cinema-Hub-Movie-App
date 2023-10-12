package com.karurmallow.demotestingapp.movie_list;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J&\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0019J&\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0019J&\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001f"}, d2 = {"Lcom/karurmallow/demotestingapp/movie_list/MAMovieListRepository;", "", "()V", "daoHelper", "Lcom/karurmallow/demotestingapp/repository/local/MADataBaseManager;", "getDaoHelper", "()Lcom/karurmallow/demotestingapp/repository/local/MADataBaseManager;", "daoHelper$delegate", "Lkotlin/Lazy;", "clearMoviesInDB", "", "userLanguage", "", "pageNumber", "", "callBack", "Lcom/karurmallow/demotestingapp/movie_list/MADataBaseCallBack;", "fetchMovieFromServer", "internet", "", "serverResponseCallBack", "Lcom/karurmallow/demotestingapp/common/MAServerCallBack;", "retrieveMovieBySearchFromDB", "searchKey", "order", "Lcom/karurmallow/demotestingapp/movie_list/MARetrieveMovieCallBack;", "retrieveMoviesFromDB", "filterOrder", "saveMoviesInDataBase", "movieResponse", "Lcom/karurmallow/demotestingapp/model/MAMovieDetails;", "app_debug"})
public final class MAMovieListRepository {
    @org.jetbrains.annotations.NotNull()
    public static final com.karurmallow.demotestingapp.movie_list.MAMovieListRepository INSTANCE = null;
    private static final kotlin.Lazy daoHelper$delegate = null;
    
    private MAMovieListRepository() {
        super();
    }
    
    private final com.karurmallow.demotestingapp.repository.local.MADataBaseManager getDaoHelper() {
        return null;
    }
    
    public final void fetchMovieFromServer(@org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int pageNumber, boolean internet, @org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.common.MAServerCallBack serverResponseCallBack) {
    }
    
    public final void clearMoviesInDB(@org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int pageNumber, @org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.movie_list.MADataBaseCallBack callBack) {
    }
    
    public final void saveMoviesInDataBase(@org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.model.MAMovieDetails movieResponse, @org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int pageNumber, @org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.movie_list.MADataBaseCallBack callBack) {
    }
    
    public final void retrieveMoviesFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int pageNumber, int filterOrder, @org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.movie_list.MARetrieveMovieCallBack callBack) {
    }
    
    public final void retrieveMovieBySearchFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKey, int order, @org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.movie_list.MARetrieveMovieCallBack callBack) {
    }
}