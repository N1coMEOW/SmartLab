package com.example.proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegistrationEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_email)
    }

    fun Click(view: View?) {

        val intent = Intent (this@RegistrationEmail, CodeEmail::class.java)
        startActivity(intent)
    }
    fun ClickTwo(view: View?) {

        val intent = Intent (this@RegistrationEmail, MainAnalyses::class.java)
        startActivity(intent)
    }
}