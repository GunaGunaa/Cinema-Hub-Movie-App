package com.karurmallow.demotestingapp.common

import android.app.Application
import com.google.firebase.perf.FirebasePerformance
import com.karurmallow.demotestingapp.repository.local.MADataBaseManager


class MAApplication : Application() {
    companion object {
        lateinit var appInstance: MAApplication
    }
    lateinit var moviesDataBaseInstance: MADataBaseManager
    override fun onCreate() {
        super.onCreate()
        initGlobalInstance()
    }

    private fun initGlobalInstance() {
        appInstance = this
        moviesDataBaseInstance = MADataBaseManager.getDatabase(this)
        FirebasePerformance.getInstance().isPerformanceCollectionEnabled = true
    }
}