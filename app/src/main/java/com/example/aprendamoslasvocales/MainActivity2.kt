package com.example.aprendamoslasvocales

import android.content.Intent
import android.media.Image
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

//Activity for Vowel E
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val back_to_a = findViewById<ImageView>(R.id.back_to_a)

        val next_to_i = findViewById<ImageView>(R.id.next_to_i)

        val img_vowel_e = findViewById<ImageView>(R.id.img_vowel_e)


        back_to_a.setOnClickListener {
            val back_a = Intent(this,MainActivity::class.java)
            startActivity(back_a)
        }

        next_to_i.setOnClickListener {
            val next_i = Intent(this,MainActivity3::class.java)
            startActivity(next_i)
        }

        img_vowel_e.setOnClickListener{
            val audio_vowel_e = MediaPlayer.create(this,R.raw.vowel_e_audio)
            audio_vowel_e.start()
        }
    }
}