package com.tai.amix

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class NotificationService : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification) {

        val pkg = sbn.packageName

        val title = sbn.notification.extras.getString("android.title")

        val text = sbn.notification.extras.getCharSequence("android.text")

        Log.d("AMIX", "[$pkg] $title : $text")
    }
}
