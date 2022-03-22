package com.example.aprendamoslasvocales

import android.content.Intent
import android.media.Image
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

//Activity for Vowel U
class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val back_to_o = findViewById<ImageView>(R.id.back_to_o)

        val next_to_win = findViewById<ImageView>(R.id.next_to_win)

        val img_vowel_u = findViewById<ImageView>(R.id.img_vowel_u)

        back_to_o.setOnClickListener {
            val back_o = Intent(this,MainActivity4::class.java)
            startActivity(back_o)
        }

        next_to_win.setOnClickListener {
            val next_win = Intent(this,MainActivity6::class.java)
            startActivity(next_win)
        }

        img_vowel_u.setOnClickListener {
            val audio_vowel_u = MediaPlayer.create(this,R.raw.vowel_u_audio)
            audio_vowel_u.start()
        }
    }
}