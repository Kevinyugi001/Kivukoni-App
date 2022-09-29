package com.example.kivukoni

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var ButtonNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonNext = findViewById(R.id.btn_next)

        ButtonNext.setOnClickListener {
            ButtonNext.setBackgroundColor(Color.RED)

            ButtonNext.setOnClickListener {
                val intent = Intent(this, DestinationActivity::class.java)
                startActivity(intent)
            }
        }
    }
}


