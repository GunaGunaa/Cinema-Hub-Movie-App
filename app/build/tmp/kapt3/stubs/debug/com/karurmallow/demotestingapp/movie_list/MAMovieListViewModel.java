package com.karurmallow.demotestingapp.movie_list;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00101\u001a\u000202J \u00103\u001a\u0002022\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020\u0011H\u0002J\u0006\u00108\u001a\u000202J\u0006\u00109\u001a\u000202J\u0010\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020,H\u0002J\u0018\u0010<\u001a\u0002022\u0006\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020\u0011H\u0002J\u000e\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020,J\u000e\u0010?\u001a\u0002022\u0006\u00107\u001a\u00020\u0011J\u000e\u0010@\u001a\u0002022\u0006\u0010;\u001a\u00020,J\u0006\u0010A\u001a\u000202R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\n\"\u0004\b\'\u0010\fR\u001a\u0010(\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u0006B"}, d2 = {"Lcom/karurmallow/demotestingapp/movie_list/MAMovieListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "filterOrderMovieListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/karurmallow/demotestingapp/model/MAMovieResults;", "getFilterOrderMovieListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setFilterOrderMovieListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "movieListLiveData", "getMovieListLiveData", "setMovieListLiveData", "movieListOrder", "", "getMovieListOrder", "()I", "setMovieListOrder", "(I)V", "movieListSize", "getMovieListSize", "setMovieListSize", "networkFlag", "getNetworkFlag", "setNetworkFlag", "networkState", "", "getNetworkState", "()Z", "setNetworkState", "(Z)V", "previousPage", "getPreviousPage", "setPreviousPage", "searchMovieListLiveData", "getSearchMovieListLiveData", "setSearchMovieListLiveData", "selectPageNumber", "getSelectPageNumber", "setSelectPageNumber", "selectedLanguage", "", "getSelectedLanguage", "()Ljava/lang/String;", "setSelectedLanguage", "(Ljava/lang/String;)V", "clearAll", "", "dataBaseHandle", "movieResponse", "Lcom/karurmallow/demotestingapp/model/MAMovieDetails;", "userLanguage", "pageNumber", "fetchMoviesFromServer", "refreshServer", "resetPageNumber", "language", "retrieveMovie", "retrieveMovieBySearchQuery", "searchKey", "retrieveOrderFilterMovie", "setLanguage", "setMovieOrder", "app_debug"})
public final class MAMovieListViewModel extends androidx.lifecycle.AndroidViewModel {
    private int networkFlag = 0;
    private boolean networkState = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedLanguage = "en-US";
    private int selectPageNumber = 1;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> movieListLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> searchMovieListLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> filterOrderMovieListLiveData;
    private int movieListSize = 0;
    private int movieListOrder = 0;
    private int previousPage = 0;
    
    public MAMovieListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final int getNetworkFlag() {
        return 0;
    }
    
    public final void setNetworkFlag(int p0) {
    }
    
    public final boolean getNetworkState() {
        return false;
    }
    
    public final void setNetworkState(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedLanguage() {
        return null;
    }
    
    public final void setSelectedLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSelectPageNumber() {
        return 0;
    }
    
    public final void setSelectPageNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> getMovieListLiveData() {
        return null;
    }
    
    public final void setMovieListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> getSearchMovieListLiveData() {
        return null;
    }
    
    public final void setSearchMovieListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> getFilterOrderMovieListLiveData() {
        return null;
    }
    
    public final void setFilterOrderMovieListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults>> p0) {
    }
    
    public final int getMovieListSize() {
        return 0;
    }
    
    public final void setMovieListSize(int p0) {
    }
    
    public final int getMovieListOrder() {
        return 0;
    }
    
    public final void setMovieListOrder(int p0) {
    }
    
    public final int getPreviousPage() {
        return 0;
    }
    
    public final void setPreviousPage(int p0) {
    }
    
    public final void setMovieOrder() {
    }
    
    public final void setLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    /**
     * it will reset the page when newly selected language is not equal to previously selected language
     */
    private final void resetPageNumber(java.lang.String language) {
    }
    
    public final void fetchMoviesFromServer() {
    }
    
    private final void dataBaseHandle(com.karurmallow.demotestingapp.model.MAMovieDetails movieResponse, java.lang.String userLanguage, int pageNumber) {
    }
    
    private final void retrieveMovie(java.lang.String userLanguage, int pageNumber) {
    }
    
    public final void retrieveMovieBySearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String searchKey) {
    }
    
    public final void retrieveOrderFilterMovie(int pageNumber) {
    }
    
    public final void refreshServer() {
    }
    
    public final void clearAll() {
    }
}