package com.karurmallow.demotestingapp.view_movie;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/karurmallow/demotestingapp/view_movie/MAViewMovieViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "movie", "Lcom/karurmallow/demotestingapp/model/MAMovieResults;", "getMovie", "()Lcom/karurmallow/demotestingapp/model/MAMovieResults;", "setMovie", "(Lcom/karurmallow/demotestingapp/model/MAMovieResults;)V", "networkState", "", "getNetworkState", "()Z", "setNetworkState", "(Z)V", "app_debug"})
public final class MAViewMovieViewModel extends androidx.lifecycle.AndroidViewModel {
    private boolean networkState = false;
    public com.karurmallow.demotestingapp.model.MAMovieResults movie;
    
    public MAViewMovieViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final boolean getNetworkState() {
        return false;
    }
    
    public final void setNetworkState(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.karurmallow.demotestingapp.model.MAMovieResults getMovie() {
        return null;
    }
    
    public final void setMovie(@org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.model.MAMovieResults p0) {
    }
}