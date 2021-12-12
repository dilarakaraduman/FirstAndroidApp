package com.ealeynaelmas.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.app.DatePickerDialog
import android.content.Intent
import android.widget.DatePicker
import android.widget.TextClock
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    var textview_date: TextView? = null
    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("ODABAK")

        textview_date = this.CheckInDate

    }

    fun dateListener(text: View){
        var dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(
                view: DatePicker, year: Int, monthOfYear: Int,
                dayOfMonth: Int
            ) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView(text as TextView)
            }
        }
        DatePickerDialog(
            this@MainActivity,
            dateSetListener,

            cal.get(Calendar.YEAR),
            cal.get(Calendar.MONTH),
            cal.get(Calendar.DAY_OF_MONTH)
        ).show()
    }

    private fun updateDateInView(textView: TextView) {
        val myFormat = "dd/MM/yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        textView!!.text = sdf.format(cal.getTime())
    }

    fun loadHotelList(view : View){
        val intent = Intent(applicationContext, HotelListActivity ::class.java)
        startActivity(intent)
    }

    fun loadMainPage(view : View){
        val intent = Intent(applicationContext, MainActivity ::class.java)
        startActivity(intent)
    }

    fun loadAddHotelPage(view : View){
        val intent = Intent(applicationContext, AddHotel ::class.java)
        startActivity(intent)
    }
}