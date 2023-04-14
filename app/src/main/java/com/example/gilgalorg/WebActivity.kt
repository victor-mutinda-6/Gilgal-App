package com.example.gilgalorg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class WebActivity : AppCompatActivity() {
    lateinit var myweb:WebView
    lateinit var home :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        home =findViewById(R.id.btnHome)

        myweb = findViewById(R.id.gWeb)
        val webSettings = myweb.settings
        webSettings.javaScriptEnabled = true
        myweb.loadUrl("https://www.facebook.com/gilgalspringsfoundation/")

        home.setOnClickListener {
            val home = Intent(this,MainActivity::class.java)
            startActivity(home)
        }

    }
}