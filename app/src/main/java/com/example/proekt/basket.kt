package com.example.proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class basket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket)
    }
    fun onMyButtonClick(view: View?) {

        val intent = Intent (this@basket,    CardPatient::class.java)
        startActivity(intent)
    }
}