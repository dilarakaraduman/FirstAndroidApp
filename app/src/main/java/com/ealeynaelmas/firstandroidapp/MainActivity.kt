package com.ealeynaelmas.firstandroidapp

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showWarning(view : View){
        val warningMessage = AlertDialog.Builder(this@MainActivity)
        val keyTextValue = keyText.text.toString();
        warningMessage.setTitle(keyTextValue)
        warningMessage.setMessage(getDataFromDatabase(keyTextValue))
        warningMessage.setPositiveButton("Tamam",DialogInterface.OnClickListener({dialogInterface, i ->}))
        warningMessage.show()
    }

    fun getDataFromDatabase(str : String) : String{
        try {
            val database = this.openOrCreateDatabase("Ders", Context.MODE_PRIVATE, null)
            database.execSQL("CREATE TABLE IF NOT EXISTS Ders_odev (id VARCHAR PRIMARY KEY, value VARCHAR)")
            //database.execSQL("INSERT INTO Ders_odev (id, value) VALUES ('bil359', 'Hello World from database')")
            val query = "SELECT * FROM Ders_odev WHERE id = '${str}'"
            val cursor = database.rawQuery(query, null)

            cursor.moveToFirst()
            val valueColumnIndex = cursor.getColumnIndex("value")
            val data = cursor.getString(valueColumnIndex)

            cursor.close()
            return data
        } catch (e: Exception) {
            // handler
        }
        return "Data yok !"
    }
}