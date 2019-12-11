package com.rohitrj.styles.ui.splashactivity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rohitrj.styles.R
import com.rohitrj.styles.ui.mainactivity.MainActivity

private const val TAG = "SplashActivity"

class SplashActivity : AppCompatActivity() {

    private lateinit var handler: Handler
    private lateinit var runnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Log.i(TAG, "onCreate")
        handler = Handler()
        runnable = Runnable {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        handler.postDelayed(runnable, 1200)
    }

    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
        handler.removeCallbacks(runnable)
        finish()
    }
}

