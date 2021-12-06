package com.ealeynaelmas.firstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HotelListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hotel_list)
        setTitle("ODABAK")
    }
    fun loadHotel(view : View){
        val intent = Intent(applicationContext, HotelActivity ::class.java)
        startActivity(intent)
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