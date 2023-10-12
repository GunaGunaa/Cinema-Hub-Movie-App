package com.karurmallow.demotestingapp.model;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@androidx.room.Entity(tableName = "moviesTable")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\u0096\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u00d6\u0003J\t\u0010:\u001a\u00020\u0007H\u00d6\u0001J\t\u0010;\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017\u00a8\u0006<"}, d2 = {"Lcom/karurmallow/demotestingapp/model/MAMovieResults;", "Ljava/io/Serializable;", "movieSerialNumber", "", "userLanguage", "", "pageNumber", "", "posterEndPoint", "movieId", "movieLanguage", "movieTitle", "movieDescription", "moviePosterEndPont", "movieReleaseDate", "movieAverageVote", "", "movieVoteCount", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Long;)V", "getMovieAverageVote", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMovieDescription", "()Ljava/lang/String;", "getMovieId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMovieLanguage", "getMoviePosterEndPont", "getMovieReleaseDate", "getMovieSerialNumber", "()J", "getMovieTitle", "getMovieVoteCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPageNumber", "()I", "getPosterEndPoint", "getUserLanguage", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Long;)Lcom/karurmallow/demotestingapp/model/MAMovieResults;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class MAMovieResults implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long movieSerialNumber = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userLanguage = null;
    private final int pageNumber = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private final java.lang.String posterEndPoint = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer movieId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private final java.lang.String movieLanguage = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private final java.lang.String movieTitle = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private final java.lang.String movieDescription = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private final java.lang.String moviePosterEndPont = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private final java.lang.String movieReleaseDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private final java.lang.Float movieAverageVote = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private final java.lang.Long movieVoteCount = null;
    
    /**
     * Created by Gowthamchandran.R on 24/11/2022
     */
    @org.jetbrains.annotations.NotNull()
    public final com.karurmallow.demotestingapp.model.MAMovieResults copy(long movieSerialNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String posterEndPoint, @org.jetbrains.annotations.Nullable()
    java.lang.Integer movieId, @org.jetbrains.annotations.Nullable()
    java.lang.String movieLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String movieTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String movieDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String moviePosterEndPont, @org.jetbrains.annotations.Nullable()
    java.lang.String movieReleaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.Float movieAverageVote, @org.jetbrains.annotations.Nullable()
    java.lang.Long movieVoteCount) {
        return null;
    }
    
    /**
     * Created by Gowthamchandran.R on 24/11/2022
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by Gowthamchandran.R on 24/11/2022
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Gowthamchandran.R on 24/11/2022
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MAMovieResults(long movieSerialNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String userLanguage, int pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String posterEndPoint, @org.jetbrains.annotations.Nullable()
    java.lang.Integer movieId, @org.jetbrains.annotations.Nullable()
    java.lang.String movieLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String movieTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String movieDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String moviePosterEndPont, @org.jetbrains.annotations.Nullable()
    java.lang.String movieReleaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.Float movieAverageVote, @org.jetbrains.annotations.Nullable()
    java.lang.Long movieVoteCount) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getMovieSerialNumber() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserLanguage() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPageNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterEndPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMovieId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMovieLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMovieTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMovieDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMoviePosterEndPont() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMovieReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMovieAverageVote() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMovieVoteCount() {
        return null;
    }
}