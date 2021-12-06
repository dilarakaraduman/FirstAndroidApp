package com.ealeynaelmas.firstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
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