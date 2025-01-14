package com.example.ocrapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class splash : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private lateinit var percentageText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Initialize the ProgressBar and TextView
        progressBar = findViewById(R.id.progressBar)
        percentageText = findViewById(R.id.percentageText)

        // Start the progress bar and text update
        progressBar.visibility = ProgressBar.VISIBLE
        var progress = 0
        val handler = Handler(Looper.getMainLooper())
        val runnable = object : Runnable {
            override fun run() {
                if (progress <= 100) {
                    progressBar.progress = progress
                    percentageText.text = "$progress%"
                    progress +=2
                    handler.postDelayed(this, 30) // Update every 30ms
                } else {
                    // After progress reaches 100%, move to MainActivity
                    val intent = Intent(this@splash, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }

        handler.post(runnable) // Start the runnable
    }
}
