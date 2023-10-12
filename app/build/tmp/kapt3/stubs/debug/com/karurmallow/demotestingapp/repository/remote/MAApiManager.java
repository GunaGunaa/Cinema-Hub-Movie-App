package com.karurmallow.demotestingapp.repository.remote;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ4\u0010\u001f\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/karurmallow/demotestingapp/repository/remote/MAApiManager;", "", "()V", "MOVIE_BASE_URL", "", "logger", "Lokhttp3/logging/HttpLoggingInterceptor;", "movieClient", "Lcom/karurmallow/demotestingapp/services/MAApiRequest;", "getMovieClient", "()Lcom/karurmallow/demotestingapp/services/MAApiRequest;", "movieClient$delegate", "Lkotlin/Lazy;", "retrofit", "Lretrofit2/Retrofit$Builder;", "kotlin.jvm.PlatformType", "getRetrofit", "()Lretrofit2/Retrofit$Builder;", "retrofit$delegate", "getMovieList", "", "movieLanguage", "page", "", "internet", "", "response", "Lcom/karurmallow/demotestingapp/common/MAServerCallBack;", "callBack", "Lretrofit2/Callback;", "Lokhttp3/ResponseBody;", "request", "call", "Lretrofit2/Call;", "app_debug"})
public final class MAApiManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.karurmallow.demotestingapp.repository.remote.MAApiManager INSTANCE = null;
    private static final java.lang.String MOVIE_BASE_URL = "https://api.themoviedb.org";
    private static final okhttp3.logging.HttpLoggingInterceptor logger = null;
    private static final kotlin.Lazy retrofit$delegate = null;
    private static final kotlin.Lazy movieClient$delegate = null;
    
    private MAApiManager() {
        super();
    }
    
    private final retrofit2.Retrofit.Builder getRetrofit() {
        return null;
    }
    
    private final com.karurmallow.demotestingapp.services.MAApiRequest getMovieClient() {
        return null;
    }
    
    public final void getMovieList(@org.jetbrains.annotations.NotNull()
    java.lang.String movieLanguage, int page, boolean internet, @org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.common.MAServerCallBack response, @org.jetbrains.annotations.NotNull()
    retrofit2.Callback<okhttp3.ResponseBody> callBack) {
    }
    
    private final void request(retrofit2.Call<okhttp3.ResponseBody> call, retrofit2.Callback<okhttp3.ResponseBody> callBack, com.karurmallow.demotestingapp.common.MAServerCallBack response, boolean internet) {
    }
}