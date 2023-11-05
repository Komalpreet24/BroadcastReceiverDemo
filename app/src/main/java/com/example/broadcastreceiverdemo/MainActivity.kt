package com.example.broadcastreceiverdemo

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

  val airplaneModeReceiver = AirplaneModeReceiver()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    registerReceiver(
      airplaneModeReceiver,
      IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
    )

  }

  override fun onDestroy() {
    super.onDestroy()
    unregisterReceiver(airplaneModeReceiver)
  }

}