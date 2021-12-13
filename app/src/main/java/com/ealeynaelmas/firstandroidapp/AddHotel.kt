package com.ealeynaelmas.firstandroidapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_add_hotel.*
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class AddHotel : AppCompatActivity() {
    var database = FirebaseDatabase.getInstance().reference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_hotel)
        setTitle("ODABAK")
    }

    fun loadMainPage(view : View){
        val intent = Intent(applicationContext, MainActivity ::class.java)
        startActivity(intent)
    }

    fun reload(){
        val intent = Intent(applicationContext, AddHotel ::class.java)
        startActivity(intent)
    }

    fun addHotelToDB(view: View){
        var hotelCity = HotelCity.text.toString()
        var hotelName = HotelName.text.toString()
        var hotelLicanceNo = LicanceNo.text.toString().toLong()
        var hoteDocumentNo = DocumentNo.text.toString().toInt()
        var hotelCost = HotelCost.text.toString().toInt()
        var hotelLocation = HotelLocation.text.toString()

        var attr1 = Attribute1.isChecked()
        var attr2 = Attribute2.isChecked()
        var attr3 = Attribute3.isChecked()
        var attr4 = Attribute4.isChecked()
        var attr5 = Attribute5.isChecked()
        var attr6 = Attribute6.isChecked()

        /*database.setValue(Hotel(hotelCity, hotelName,hotelLicanceNo,
            hotelCost,hotelLocation,hoteDocumentNo,attr1, attr2, attr3,
            attr4, attr5, attr6))*/
       var myId = database.push().key

        database.child("Hotels").child(myId.toString()).setValue(Hotel(hotelCity, hotelName,hotelLicanceNo,
            hotelCost,hotelLocation,hoteDocumentNo,attr1, attr2, attr3,
            attr4, attr5, attr6))

        reload()
    }
}