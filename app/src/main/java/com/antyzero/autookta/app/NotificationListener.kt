package com.antyzero.autookta.app

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.widget.Toast

class NotificationListener : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        if (sbn.packageName == "com.okta.android.auth") {
            sbn.notification.actions.first { it.title.contains("Tak") }?.actionIntent?.send()
        }
    }
}