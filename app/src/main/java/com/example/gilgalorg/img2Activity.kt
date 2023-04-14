package com.example.gilgalorg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class img2Activity : AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var btnPrev:Button
    lateinit var btnHome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img2)
        btnNext = findViewById(R.id.btnNext)
        btnPrev = findViewById(R.id.btnPrev)
        btnHome = findViewById(R.id.btnHome)

        btnNext.setOnClickListener {
            var next = Intent(this,img3Activity::class.java)
            startActivity(next)
        }

        btnPrev.setOnClickListener {
            var prev = Intent(this,imgActivity::class.java)
            startActivity(prev)
        }

        btnHome.setOnClickListener {
            var home= Intent(this,MainActivity::class.java)
            startActivity(home)
        }



    }
}