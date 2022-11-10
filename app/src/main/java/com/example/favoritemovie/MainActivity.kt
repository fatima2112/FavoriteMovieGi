package com.example.favoritemovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo = findViewById<Button>(R.id.btnGo)
        btnGo.setOnClickListener{
            val intent = Intent(this, Movie::class.java)
            startActivity(intent)
        }

    }
}