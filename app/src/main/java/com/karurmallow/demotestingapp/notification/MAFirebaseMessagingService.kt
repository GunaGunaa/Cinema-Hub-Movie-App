package com.karurmallow.demotestingapp.notification

import android.annotation.SuppressLint
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.test.core.app.ApplicationProvider

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.karurmallow.demotestingapp.movie_list.MAMovieListActivity

class MAFirebaseMessagingService: FirebaseMessagingService() {
    companion object{
        const val CHANNEL_ID = "notification_channel"
    }

    override fun onNewToken(token: String) {
        Log.d("TAG123", "Refreshed token: $token")
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage){
        if (remoteMessage.notification != null){
            showNotification(remoteMessage.notification!!.title, remoteMessage.notification!!.body)
        }
    }

    private fun showNotification(title: String?, message: String?) {
        val intent = Intent(this, MAMovieListActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)

        val builder: NotificationCompat.Builder = NotificationCompat.Builder(
            ApplicationProvider.getApplicationContext<Context>(), CHANNEL_ID)
            .setAutoCancel(true)
            .setContentTitle(title)
            .setContentText(message)
            .setVibrate(longArrayOf(1000, 1000, 1000, 1000, 1000))
            //.setOnlyAlertOnce(true)
            .setContentIntent(pendingIntent)
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(0, builder.build())
    }
}