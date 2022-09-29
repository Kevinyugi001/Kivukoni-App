package com.example.kivukoni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MombasaActivity : AppCompatActivity() {
    lateinit var ButtonPrivate: Button
    lateinit var ButtonCanter: Button
    lateinit var ButtonTrailers: Button
    lateinit var ButtonLorries: Button
    lateinit var ButtonBreak: Button
    lateinit var ButtonTuktuksandBodaboda: Button
    lateinit var ButtonBus: Button
    lateinit var ButtonPetrolCars: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mombasa)
        ButtonPrivate=findViewById(R.id.btn_private)
        ButtonCanter=findViewById(R.id.btn_private3)
        ButtonTrailers =findViewById(R.id.btn_private2)
        ButtonLorries=findViewById(R.id.btn_private8)
        ButtonBreak=findViewById(R.id.btn_private7)
        ButtonTuktuksandBodaboda=findViewById(R.id.btn_private6)
        ButtonBus =findViewById(R.id.btn_private5)
        ButtonPetrolCars=findViewById(R.id.btn_private4)

        ButtonPrivate.setOnClickListener {
            val intent= Intent(this, PrivateActivity::class.java)
            startActivity(intent)
        }
        ButtonCanter.setOnClickListener {
            val intent= Intent(this, CanterActivity::class.java)
            startActivity(intent)
        }
        ButtonTrailers.setOnClickListener {
            val intent= Intent(this, TrailerActivity::class.java)
            startActivity(intent)
        }
        ButtonLorries.setOnClickListener {
            val intent= Intent(this, LorriesActivity::class.java)
            startActivity(intent)
        }
        ButtonBreak.setOnClickListener {
            val intent= Intent(this, BreakActivity::class.java)
            startActivity(intent)
        }
        ButtonTuktuksandBodaboda.setOnClickListener {
            val intent= Intent(this, TuktukActivity::class.java)
            startActivity(intent)
        }
        ButtonBus.setOnClickListener {
            val intent= Intent(this, BusActivity::class.java)
            startActivity(intent)
        }
        ButtonPetrolCars.setOnClickListener {
            val intent= Intent(this, PetrolCarsActivity::class.java)
            startActivity(intent)
        }

    }
}
