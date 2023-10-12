package com.karurmallow.demotestingapp.services;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/karurmallow/demotestingapp/services/MAApiRequest;", "", "fetchMovieFromServer", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "language", "", "page", "", "Companion", "app_debug"})
public abstract interface MAApiRequest {
    @org.jetbrains.annotations.NotNull()
    public static final com.karurmallow.demotestingapp.services.MAApiRequest.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Accept:application/json"})
    @retrofit2.http.GET(value = "/3/movie/top_rated?api_key=f6a7fd2ad2e174eb8aada2b4fc11a8e4")
    public abstract retrofit2.Call<okhttp3.ResponseBody> fetchMovieFromServer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/karurmallow/demotestingapp/services/MAApiRequest$Companion;", "", "()V", "MOVIE_END_POINT", "", "app_debug"})
    public static final class Companion {
        private static final java.lang.String MOVIE_END_POINT = "/3/movie/top_rated?api_key=f6a7fd2ad2e174eb8aada2b4fc11a8e4";
        
        private Companion() {
            super();
        }
    }
}