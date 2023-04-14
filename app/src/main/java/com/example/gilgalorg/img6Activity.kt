package com.example.gilgalorg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class img6Activity : AppCompatActivity() {
    lateinit var btnPrev: Button
    lateinit var btnHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img6)
        btnPrev = findViewById(R.id.btnPrev)
        btnHome = findViewById(R.id.btnHome)


        btnPrev.setOnClickListener {
            var prev = Intent(this,img5Activity::class.java)
            startActivity(prev)
        }

        btnHome.setOnClickListener {
            var home= Intent(this,MainActivity::class.java)
            startActivity(home)
        }



    }
}