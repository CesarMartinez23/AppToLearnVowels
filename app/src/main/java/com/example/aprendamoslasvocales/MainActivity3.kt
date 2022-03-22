package com.example.aprendamoslasvocales

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

//Activity for Vowel I
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val back_to_e = findViewById<ImageView>(R.id.back_to_e)

        val next_to_o = findViewById<ImageView>(R.id.next_to_o)

        val img_vowel_i = findViewById<ImageView>(R.id.img_vowel_i)

        back_to_e.setOnClickListener {
            val back_e = Intent(this,MainActivity2::class.java)
            startActivity(back_e)
        }

        next_to_o.setOnClickListener {
            val next_o = Intent(this,MainActivity4::class.java)
            startActivity(next_o)
        }

        img_vowel_i.setOnClickListener {
            val audio_vowel_i = MediaPlayer.create(this,R.raw.vowel_i_audio)
            audio_vowel_i.start()
        }
    }
}