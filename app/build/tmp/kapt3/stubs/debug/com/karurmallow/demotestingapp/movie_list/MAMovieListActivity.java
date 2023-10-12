package com.karurmallow.demotestingapp.movie_list;

import java.lang.System;

@kotlin.Suppress(names = {"UNUSED_EXPRESSION", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0017J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u0014H\u0014J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010\'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002J\b\u0010*\u001a\u00020\u0014H\u0002J\b\u0010+\u001a\u00020\u0014H\u0002J\u001e\u0010,\u001a\u00020\u00142\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190.2\u0006\u0010/\u001a\u00020\u001dH\u0002J\u0010\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u000202H\u0003J\b\u00103\u001a\u00020\u0014H\u0002J\u0010\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/karurmallow/demotestingapp/movie_list/MAMovieListActivity;", "Lcom/karurmallow/demotestingapp/common/MABaseActivity;", "()V", "analytic", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebasePerformance", "Lcom/google/firebase/perf/metrics/Trace;", "movieListAdapter", "Lcom/karurmallow/demotestingapp/movie_list/MAMovieListAdapter;", "movieListBinding", "Lcom/karurmallow/demotestingapp/databinding/MaActivityMovieListBinding;", "movieListViewModel", "Lcom/karurmallow/demotestingapp/movie_list/MAMovieListViewModel;", "getMovieListViewModel", "()Lcom/karurmallow/demotestingapp/movie_list/MAMovieListViewModel;", "movieListViewModel$delegate", "Lkotlin/Lazy;", "sentryTest", "", "exitDialogBox", "", "fetchMovies", "listeners", "navigateToViewMovie", "selectedMovie", "Lcom/karurmallow/demotestingapp/model/MAMovieResults;", "networkListener", "networkStatusBanner", "networkState", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "pullRefreshListener", "recyclerViewListener", "remoteConfig", "retrieveMovieObserver", "retrieveOrderFilterMovieObserver", "retrieveSearchMovieObserver", "searchViewListener", "sentry", "setClickListener", "setMovieAdapter", "receivedMovieList", "", "isFilterQuery", "showPopMenu", "view", "Landroid/view/View;", "sortingFilter", "userInteraction", "isAllowed", "viewModelObservers", "app_debug"})
public final class MAMovieListActivity extends com.karurmallow.demotestingapp.common.MABaseActivity {
    private java.lang.String sentryTest;
    private com.google.firebase.analytics.FirebaseAnalytics analytic;
    private com.karurmallow.demotestingapp.movie_list.MAMovieListAdapter movieListAdapter;
    private final kotlin.Lazy movieListViewModel$delegate = null;
    private com.karurmallow.demotestingapp.databinding.MaActivityMovieListBinding movieListBinding;
    private com.google.firebase.perf.metrics.Trace firebasePerformance;
    
    public MAMovieListActivity() {
        super();
    }
    
    private final com.karurmallow.demotestingapp.movie_list.MAMovieListViewModel getMovieListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void sentry() {
    }
    
    private final void remoteConfig() {
    }
    
    private final void viewModelObservers() {
    }
    
    private final void listeners() {
    }
    
    private final void retrieveOrderFilterMovieObserver() {
    }
    
    private final void retrieveSearchMovieObserver() {
    }
    
    private final void retrieveMovieObserver() {
    }
    
    private final void networkListener() {
    }
    
    private final void fetchMovies() {
    }
    
    /**
     * Sent movie list to adapter class
     */
    private final void setMovieAdapter(java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults> receivedMovieList, boolean isFilterQuery) {
    }
    
    private final void pullRefreshListener() {
    }
    
    /**
     * pagination logics
     */
    private final void recyclerViewListener() {
    }
    
    private final void setClickListener() {
    }
    
    private final void sortingFilter() {
    }
    
    private final void searchViewListener() {
    }
    
    /**
     * Initializing the popup menu and giving the reference as current context
     */
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation", "InvalidAnalyticsName"})
    private final void showPopMenu(android.view.View view) {
    }
    
    /**
     * Received selected movie from movie list &&
     * navigate to next screen(MAViewMovieActivity)
     */
    private final void navigateToViewMovie(com.karurmallow.demotestingapp.model.MAMovieResults selectedMovie) {
    }
    
    private final void userInteraction(boolean isAllowed) {
    }
    
    private final void networkStatusBanner(boolean networkState) {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onBackPressed() {
    }
    
    private final void exitDialogBox() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}