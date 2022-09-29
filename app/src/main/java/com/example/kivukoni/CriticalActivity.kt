package com.example.kivukoni

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class CriticalActivity : AppCompatActivity() {

    lateinit var ButtonEmail: Button
    lateinit var ButtonSms: Button
    lateinit var ButtonCall: Button
    lateinit var ButtonDial: Button
    lateinit var ButtonShare: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_critical)


        ButtonEmail=findViewById(R.id.Btn_email)
        ButtonSms=findViewById(R.id.Btn_sms)
        ButtonDial=findViewById(R.id.Btn_dial)
        ButtonShare=findViewById(R.id.Btn_share)

        ButtonSms!!.setOnClickListener {
            val uri = Uri.parse("smsto:0728125072")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", "The SMS text")

            startActivity(intent)

        }
        ButtonEmail!!.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }
        ButtonShare!!.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Hey,download this app!")
            startActivity(shareIntent)

        }
        ButtonDial!!.setOnClickListener {
            val phone = "+254728125072"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)


        }

        }
    }

