package com.example.gilgalorg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.RawContacts
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var contacts: Button
    lateinit var img:Button
    lateinit var web:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contacts = findViewById(R.id.btnContacts)
        img = findViewById(R.id.btnimages)
        web = findViewById(R.id.btnWeb)

        contacts.setOnClickListener {
            var contacts = Intent(this, contactsActivity::class.java)
            startActivity(contacts)
        }

        img.setOnClickListener {
            var img = Intent(this, imgActivity::class.java)
            startActivity(img)
        }
        web.setOnClickListener {
            val web = Intent(this,WebActivity::class.java)
            startActivity(web)
        }
    }

}