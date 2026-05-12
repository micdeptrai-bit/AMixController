package com.tai.amix

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class MusicListenerService : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification) {

        if (sbn.packageName == "com.apple.android.music") {

            val extras = sbn.notification.extras

            val title = extras.getString("android.title")
            val artist = extras.getString("android.text")

            Log.d("AMIX", "Bài hát: $title")
            Log.d("AMIX", "Ca sĩ: $artist")
        }
    }
}