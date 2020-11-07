package com.example.ejemplogit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_window2.*

class window2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window2)
        logInButton.setOnClickListener{
            val intent = Intent(this, musica::class.java)
            startActivity(intent)
        }

    }
}