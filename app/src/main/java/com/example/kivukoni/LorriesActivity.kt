package com.example.kivukoni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LorriesActivity : AppCompatActivity() {
    lateinit var Buttonfront: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lorries)

        Buttonfront=findViewById(R.id.Btn_front)

        Buttonfront.setOnClickListener {
            val intent= Intent(this, ChargesActivity::class.java)
            startActivity(intent)
        }

    }
}