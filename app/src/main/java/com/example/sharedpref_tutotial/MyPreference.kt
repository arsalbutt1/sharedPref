package com.example.sharedpref_tutotial

import android.content.Context
import android.content.SharedPreferences
import android.view.View
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import java.util.*

class MyPreference(context: Context){

    val SHARED_PREFS = "sharedPrefs"
    val TEXT = "text"
    val pref:SharedPreferences = context.getSharedPreferences(SHARED_PREFS,Context.MODE_PRIVATE)

    fun saveData(mytext:String){

        // putString is used to save data
        val editor = pref.edit()
        editor.putString(TEXT, mytext)
        editor.apply()

    }

    fun loadData():String{

        // getString is used to retreive data
       return pref.getString(TEXT,"").toString()


    }




}