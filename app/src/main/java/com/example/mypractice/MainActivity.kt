package com.example.mypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var clickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickCountDisplayView = findViewById<TextView>(R.id.clickCountView)
        val RedButton = findViewById<TextView>(R.id.clickButton)
        val GreenButton = findViewById<TextView>(R.id.clickButton1)
        val BlueButton = findViewById<TextView>(R.id.clickButton2)

        RedButton.setOnClickListener {
            clickCount++
            clickCountDisplayView.text = "Red was clicked"
        }
        GreenButton.setOnClickListener {
            clickCount++
            clickCountDisplayView.text = "Green was clicked"
        }
        BlueButton.setOnClickListener {
            clickCount++
            clickCountDisplayView.text = "Blue was clicked"
        }
    }
}