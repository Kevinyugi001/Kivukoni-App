package com.example.kivukoni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DestinationActivity : AppCompatActivity() {
    lateinit var ButtonMombasa: Button
    lateinit var ButtonLikoni: Button
    lateinit var ButtonQuerry: Button
    lateinit var Buttoncontact: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        ButtonMombasa = findViewById(R.id.Btn_mombasa)
        ButtonLikoni = findViewById(R.id.Btn_likoni)
        ButtonQuerry = findViewById(R.id.btn_Querry)
        Buttoncontact = findViewById(R.id.btn_contact)

        ButtonMombasa.setOnClickListener {
            val intent = Intent(this, MombasaActivity::class.java)
            startActivity(intent)
        }
        ButtonLikoni.setOnClickListener {
            val intent = Intent(this, LikoniActivity::class.java)
            startActivity(intent)
        }
        ButtonQuerry.setOnClickListener {
            val intent = Intent(this, FeedbackActivity::class.java)
            startActivity(intent)

            Buttoncontact.setOnClickListener {
                val intent = Intent(this, CriticalActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
