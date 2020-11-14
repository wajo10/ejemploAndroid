package com.example.ejemplogit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_p1411.*

class p1411 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p1411)
        var cont = 0
        des.setOnClickListener{
            if(cont%2 == 0){
                textoadios.visibility = View.VISIBLE}
            else{
                textoadios.visibility = View.INVISIBLE}
            cont++
        }
    }
}