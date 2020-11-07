package com.example.ejemplogit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_musica.*

class musica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musica)
        botonaso.setOnClickListener{
            Toast.makeText(this,"Estas fresco", Toast.LENGTH_LONG).show()
        }
    }
}