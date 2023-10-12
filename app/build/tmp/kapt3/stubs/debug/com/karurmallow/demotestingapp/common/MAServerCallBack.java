package com.karurmallow.demotestingapp.common;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 26/11/2022
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/karurmallow/demotestingapp/common/MAServerCallBack;", "", "onFailure", "", "error", "", "onNetworkFailure", "onSuccess", "movieResponse", "Lcom/karurmallow/demotestingapp/model/MAMovieDetails;", "userLanguage", "pageNumber", "", "app_debug"})
public abstract interface MAServerCallBack {
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.model.MAMovieDetails movieResponse, @org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int pageNumber);
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String error);
    
    public abstract void onNetworkFailure();
}