package com.karurmallow.demotestingapp.common;

import java.lang.System;

/**
 * Created by Gowthamchandran.R on 25/11/2022
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/karurmallow/demotestingapp/common/MANetworkMonitor;", "Landroidx/lifecycle/LiveData;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "(Landroid/net/ConnectivityManager;)V", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "onActive", "", "onInactive", "app_debug"})
public final class MANetworkMonitor extends androidx.lifecycle.LiveData<java.lang.Boolean> {
    private final android.net.ConnectivityManager connectivityManager = null;
    @android.annotation.SuppressLint(value = {"ObsoleteSdkInt"})
    private final android.net.ConnectivityManager.NetworkCallback networkCallback = null;
    
    public MANetworkMonitor(@org.jetbrains.annotations.NotNull()
    android.net.ConnectivityManager connectivityManager) {
        super(null);
    }
    
    public MANetworkMonitor(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
}