package com.rohitrj.styles.ui.erroractivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rohitrj.styles.R
import kotlinx.android.synthetic.main.activity_error.*

@Suppress("DEPRECATION")
class ErrorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)

        retry.setOnClickListener {
            finish()
        }
    }


}
