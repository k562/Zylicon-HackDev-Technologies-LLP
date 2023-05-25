package com.example.oxygreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ProgressBar

class SplashScreen : AppCompatActivity() {

    // Initialising the progress bar
    lateinit var progressbar  : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //  Assigning the progress bar
        progressbar = findViewById(R.id.progressBar)

        // Hide the status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        progressbar.visibility = View.VISIBLE



        // Handler to delay the splash screen for 3 seconds and to set the visiblity of progress bar to gone after 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            progressbar.visibility = View.GONE

        }, 3000)
    }
}