package com.example.proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CardPatient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_patient)
    }
    fun onMyButtonClick(view: View?) {

        val intent = Intent (this@CardPatient, RegistrationEmail::class.java)
        startActivity(intent)
    }
}