package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        println("OnStart Method")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart Method")
    }

    override fun onPause() {
        super.onPause()
        println("onPause Method")
    }

    override fun onStop() {
        super.onStop()
        println("onStop Method")
    }

    override fun onResume() {
        super.onResume()
        println("onResume Method")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Method")
    }
}
