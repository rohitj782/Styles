package com.rohitrj.styles.ui.mainactivity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.rohitrj.styles.R
import com.rohitrj.styles.internals.utils.NetworkChangeReceiver
import com.rohitrj.styles.ui.erroractivity.ErrorActivity


private const val TAG = "MainActivity"
private lateinit var navController: NavController
private var mNetworkReceiver: BroadcastReceiver? = null
private lateinit var context: Context

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate: Started")
        navController = Navigation.findNavController(
            this,
            R.id.fragment
        )

        context = this
        mNetworkReceiver = NetworkChangeReceiver();
        registerNetworkBroadcast();
    }

    private fun registerNetworkBroadcast() {
        registerReceiver(mNetworkReceiver, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
    }

    private fun unregisterNetworkChanges() {
        try {
            unregisterReceiver(mNetworkReceiver);
        } catch (e: IllegalArgumentException) {
            e.printStackTrace();
        }
    }

    companion object{
        fun showError(){
            val intent = Intent(context,ErrorActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        registerNetworkBroadcast()
    }

    override fun onPause() {
        super.onPause()
        unregisterNetworkChanges()
    }

    override fun onStop() {
        super.onStop()
        unregisterNetworkChanges()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_main_menu, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(findNavController(R.id.fragment))
                || super.onOptionsItemSelected(item)
    }
}
