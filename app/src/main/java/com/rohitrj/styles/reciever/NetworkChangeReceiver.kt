package com.rohitrj.styles.reciever

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import com.rohitrj.styles.ui.mainactivity.MainActivity.Companion.showError

private const val TAG = "NetworkChangeReceiver"

@Suppress("DEPRECATION")
class NetworkChangeReceiver : BroadcastReceiver() {
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context, intent: Intent?) {
        try {
            if (!isOnline(context)) {
                showError()
            }
        } catch (e: NullPointerException) {
            e.printStackTrace()
        }

    }

    fun isOnline(context: Context): Boolean {
        return try {
            val cm =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = cm.activeNetworkInfo
            //should check null because in airplane mode it will be null
            netInfo != null && netInfo.isConnected
        } catch (e: NullPointerException) {
            e.printStackTrace()
            false
        }
    }

}