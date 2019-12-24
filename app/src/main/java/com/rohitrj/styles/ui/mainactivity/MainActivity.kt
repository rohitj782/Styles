package com.rohitrj.styles.ui.mainactivity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.rohitrj.styles.R
import com.rohitrj.styles.reciever.NetworkChangeReceiver
import com.rohitrj.styles.ui.erroractivity.ErrorActivity
import kotlinx.android.synthetic.main.activity_main.*


private const val TAG = "MainActivity"
private lateinit var navController: NavController
private var mNetworkReceiver: BroadcastReceiver? = null
private lateinit var context: Context
private lateinit var drawerLayout: DrawerLayout

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Log.i(TAG, "onCreate: Started")
        navController = Navigation.findNavController(
            this,
            R.id.fragment
        )
        drawerLayout = findViewById(R.id.drawer_layout)
        NavigationUI.setupWithNavController(toolbar, navController, drawerLayout)
        context = this
        mNetworkReceiver = NetworkChangeReceiver();
        registerNetworkBroadcast();
    }

    private fun registerNetworkBroadcast() {
        registerReceiver(mNetworkReceiver, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    private fun unregisterNetworkChanges() {
        try {
            unregisterReceiver(mNetworkReceiver);
        } catch (e: IllegalArgumentException) {
            e.printStackTrace();
        }
    }

    companion object {
        fun showError() {
            val intent = Intent(context, ErrorActivity::class.java)
            context.startActivity(intent)
        }
    }

    var handler = Handler()
    var runnable = Runnable { registerNetworkBroadcast() }

    override fun onRestart() {
        super.onRestart()
        handler.postDelayed(runnable, 2000)
    }

    override fun onStop() {
        super.onStop()
        unregisterNetworkChanges()
        handler.removeCallbacks(runnable)
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

    fun showItem(view: View) {
        val buttonInfo: Button = view.findViewById(view.id)
        val infoText = buttonInfo.text
        Toast.makeText(context, infoText, Toast.LENGTH_SHORT).show()
    }
}
