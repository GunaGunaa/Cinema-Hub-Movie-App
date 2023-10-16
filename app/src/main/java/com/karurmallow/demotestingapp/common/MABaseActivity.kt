package com.karurmallow.demotestingapp.common

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

open class MABaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAll()
    }

    private fun initAll() {
        setStatusBarStyle()
    }

    @Suppress("DEPRECATION")
    fun setStatusBarStyle() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            /**
             * Change status bar colour to white & icon colours to black
             * minimum required android version - 6.0 marshmallow(min api 23)
             */
            window.statusBarColor = Color.WHITE
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        /**
         * If the device version is below marshmallow
         * then it will keep default device status bar colour & icon colour
         */
    }
}