package com.example.aprendamoslasvocales

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

//Activity for Vowel A
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next_to_e = findViewById<ImageView>(R.id.next_to_e)

        val img_vowel_a = findViewById<ImageView>(R.id.img_vowel_a)

        next_to_e.setOnClickListener {
            val next_e = Intent(this,MainActivity2::class.java)
            startActivity(next_e)
        }

        img_vowel_a.setOnClickListener{
            val audio_vowel_a = MediaPlayer.create(this,R.raw.vowel_a_audio)
            audio_vowel_a.start()
        }
    }
}