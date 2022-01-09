package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x : Button = findViewById(R.id.button)


       x.setOnClickListener{

           val intent = Intent(this,Page2::class.java)
              startActivity(intent)


       }

    }
}