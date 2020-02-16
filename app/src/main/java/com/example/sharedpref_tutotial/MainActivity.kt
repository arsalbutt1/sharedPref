 package com.example.sharedpref_tutotial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saveButton(save_button)

    }

     fun saveButton(view: View){

         // passing data to save into Mypreference object
         val myPreference = MyPreference(this)
         myPreference.saveData(edittext.text.toString())

         // displaying the save data from the Mypreference object
         val dptext = myPreference.loadData()
         textview.text = dptext




     }

      fun applyText(view: View){

         textview.text = edittext.text.toString()
     }
}
