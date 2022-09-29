package com.example.kivukoni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChargesActivity : AppCompatActivity() {
    lateinit var Buttonfront: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charges)

        Buttonfront=findViewById(R.id.btn_stk)


            Buttonfront.setOnClickListener {
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }
        }

    }
}

