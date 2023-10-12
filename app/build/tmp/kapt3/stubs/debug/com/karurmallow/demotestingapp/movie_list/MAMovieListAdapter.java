package com.karurmallow.demotestingapp.movie_list;

import java.lang.System;

/**
 * created by Gowthamchandran.R on 24/11/2022
 */
@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0016\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/karurmallow/demotestingapp/movie_list/MAMovieListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/karurmallow/demotestingapp/movie_list/MAMovieListAdapter$MAMovieViewHolder;", "context", "Landroid/content/Context;", "returnMovie", "Lkotlin/Function1;", "Lcom/karurmallow/demotestingapp/model/MAMovieResults;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "movieList", "", "getItemCount", "", "onBindViewHolder", "movieHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateMovieList", "newMovies", "MAMovieViewHolder", "app_debug"})
public final class MAMovieListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.karurmallow.demotestingapp.movie_list.MAMovieListAdapter.MAMovieViewHolder> {
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function1<com.karurmallow.demotestingapp.model.MAMovieResults, kotlin.Unit> returnMovie = null;
    private java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults> movieList;
    
    public MAMovieListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.karurmallow.demotestingapp.model.MAMovieResults, kotlin.Unit> returnMovie) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.karurmallow.demotestingapp.movie_list.MAMovieListAdapter.MAMovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.movie_list.MAMovieListAdapter.MAMovieViewHolder movieHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void updateMovieList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.karurmallow.demotestingapp.model.MAMovieResults> newMovies) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/karurmallow/demotestingapp/movie_list/MAMovieListAdapter$MAMovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "movieCellBinding", "Lcom/karurmallow/demotestingapp/databinding/MaAdapterMovieCellBinding;", "(Lcom/karurmallow/demotestingapp/movie_list/MAMovieListAdapter;Lcom/karurmallow/demotestingapp/databinding/MaAdapterMovieCellBinding;)V", "getMovieCellBinding", "()Lcom/karurmallow/demotestingapp/databinding/MaAdapterMovieCellBinding;", "app_debug"})
    public final class MAMovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.karurmallow.demotestingapp.databinding.MaAdapterMovieCellBinding movieCellBinding = null;
        
        public MAMovieViewHolder(@org.jetbrains.annotations.NotNull()
        com.karurmallow.demotestingapp.databinding.MaAdapterMovieCellBinding movieCellBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.karurmallow.demotestingapp.databinding.MaAdapterMovieCellBinding getMovieCellBinding() {
            return null;
        }
    }
}