package com.karurmallow.demotestingapp.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/karurmallow/demotestingapp/common/MAApplication;", "Landroid/app/Application;", "()V", "moviesDataBaseInstance", "Lcom/karurmallow/demotestingapp/repository/local/MADataBaseManager;", "getMoviesDataBaseInstance", "()Lcom/karurmallow/demotestingapp/repository/local/MADataBaseManager;", "setMoviesDataBaseInstance", "(Lcom/karurmallow/demotestingapp/repository/local/MADataBaseManager;)V", "initGlobalInstance", "", "onCreate", "Companion", "app_debug"})
public final class MAApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.karurmallow.demotestingapp.common.MAApplication.Companion Companion = null;
    public static com.karurmallow.demotestingapp.common.MAApplication appInstance;
    public com.karurmallow.demotestingapp.repository.local.MADataBaseManager moviesDataBaseInstance;
    
    public MAApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.karurmallow.demotestingapp.repository.local.MADataBaseManager getMoviesDataBaseInstance() {
        return null;
    }
    
    public final void setMoviesDataBaseInstance(@org.jetbrains.annotations.NotNull()
    com.karurmallow.demotestingapp.repository.local.MADataBaseManager p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initGlobalInstance() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/karurmallow/demotestingapp/common/MAApplication$Companion;", "", "()V", "appInstance", "Lcom/karurmallow/demotestingapp/common/MAApplication;", "getAppInstance", "()Lcom/karurmallow/demotestingapp/common/MAApplication;", "setAppInstance", "(Lcom/karurmallow/demotestingapp/common/MAApplication;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.karurmallow.demotestingapp.common.MAApplication getAppInstance() {
            return null;
        }
        
        public final void setAppInstance(@org.jetbrains.annotations.NotNull()
        com.karurmallow.demotestingapp.common.MAApplication p0) {
        }
    }
}