package com.karurmallow.demotestingapp.repository.local;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
@androidx.room.Database(entities = {com.karurmallow.demotestingapp.model.MAMovieResults.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/karurmallow/demotestingapp/repository/local/MADataBaseManager;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/karurmallow/demotestingapp/services/MAMovieDao;", "Companion", "app_debug"})
public abstract class MADataBaseManager extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.karurmallow.demotestingapp.repository.local.MADataBaseManager.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.karurmallow.demotestingapp.repository.local.MADataBaseManager MAMovieDataBaseInstance;
    
    public MADataBaseManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.karurmallow.demotestingapp.services.MAMovieDao userDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/karurmallow/demotestingapp/repository/local/MADataBaseManager$Companion;", "", "()V", "MAMovieDataBaseInstance", "Lcom/karurmallow/demotestingapp/repository/local/MADataBaseManager;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.karurmallow.demotestingapp.repository.local.MADataBaseManager getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}