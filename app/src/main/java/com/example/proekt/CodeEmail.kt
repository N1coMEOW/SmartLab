package com.example.proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CodeEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_email)
    }
    fun onMyButtonClick(view: View?) {

        val intent = Intent (this@CodeEmail,    RegistrationEmail::class.java)
        startActivity(intent)
    }
}