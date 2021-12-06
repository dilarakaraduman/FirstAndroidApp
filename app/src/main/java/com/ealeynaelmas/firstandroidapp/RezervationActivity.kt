package com.ealeynaelmas.firstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RezervationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rezervation)
        setTitle("ODABAK")
    }

    fun loadMainPage(view : View){
        val intent = Intent(applicationContext, MainActivity ::class.java)
        startActivity(intent)
    }

    fun loadProfilePage(view : View){
        val intent = Intent(applicationContext, ProfileActivity ::class.java)
        startActivity(intent)
    }
}