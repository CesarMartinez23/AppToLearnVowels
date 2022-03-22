package com.example.aprendamoslasvocales

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

//Activity for Vowel O
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val back_to_i = findViewById<ImageView>(R.id.back_to_i)

        val next_to_u = findViewById<ImageView>(R.id.next_to_u)

        val img_vowel_o = findViewById<ImageView>(R.id.img_vowel_o)

        back_to_i.setOnClickListener {
            val back_i = Intent(this,MainActivity3::class.java)
            startActivity(back_i)
        }

        next_to_u.setOnClickListener {
            val next_u = Intent(this,MainActivity5::class.java)
            startActivity(next_u)
        }

        img_vowel_o.setOnClickListener {
            val audio_vowel_o = MediaPlayer.create(this,R.raw.vowel_o_audio)
            audio_vowel_o.start()
        }
    }
}