package com.karurmallow.demotestingapp.common

import android.content.Context
import android.widget.Toast

/**
 * Created by Gowthamchandran.R on 24/11/2022
 */
fun Context.toastMessage(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
