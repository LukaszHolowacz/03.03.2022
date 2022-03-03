package com.example.a03032022

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pizze
        val margherita = findViewById<CheckBox>(R.id.margheritacb)
        val pepperoni = findViewById<CheckBox>(R.id.pepperonicb)
        val capricciosa = findViewById<CheckBox>(R.id.capricciosacb)
        val diavola = findViewById<CheckBox>(R.id.diavolacb)
        val vege = findViewById<CheckBox>(R.id.vegetarianacb)


        if(margherita.isChecked){

        }
        if(pepperoni.isChecked){

        }
        if(capricciosa.isChecked){

        }
        if(diavola.isChecked){

        }
        if(vege.isChecked){

        }
    }
}