package com.steptracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.steptracker_lib.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HelloWorld().getPrint("Check")
    }
}