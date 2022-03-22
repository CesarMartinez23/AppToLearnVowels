package com.example.aprendamoslasvocales

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView
import com.bumptech.glide.Glide

@SuppressLint("CustomSplashScreen")
class SplashScreenStart : AppCompatActivity() {

    val durationSplashScreen : Long = 2000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_start)
        changeActivity()
    }

    private fun changeActivity(){
        Handler().postDelayed(Runnable {
            val next = Intent(this, MainActivity::class.java)
            startActivity(next)
        }, durationSplashScreen)
    }
}