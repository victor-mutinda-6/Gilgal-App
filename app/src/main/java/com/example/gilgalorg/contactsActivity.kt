package com.example.gilgalorg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class contactsActivity : AppCompatActivity() {
    lateinit var btnHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        btnHome = findViewById(R.id.btnHome)

        btnHome.setOnClickListener {
            var home = Intent(this, MainActivity::class.java)
            startActivity(home)
        }
    }
}