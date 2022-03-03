package com.example.a03032022

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        //sosy
        val pomidorowy = findViewById<CheckBox>(R.id.pomidorowycb)
        val czosnkowy = findViewById<CheckBox>(R.id.czosnkowycb)
        val ostry = findViewById<CheckBox>(R.id.ostrycb)
        val lagodny = findViewById<CheckBox>(R.id.lagodnycb)
        val twysp = findViewById<CheckBox>(R.id.twyspcb)

        findViewById<Button>(R.id.zamow).setOnClickListener {
            val result = StringBuilder()
            var cena: Int = 0

            if(margherita.isChecked){
                result.append("\nMargherita 30zł")
                cena += 30
            }
            if(pepperoni.isChecked){
                result.append("\nPepperoni 35zł")
                cena += 35
            }
            if(capricciosa.isChecked){
                result.append("\nCapriciossa 35zł")
                cena += 35
            }
            if(diavola.isChecked){
                result.append("\nDiavola 35zł")
                cena += 35
            }
            if(vege.isChecked){
                result.append("\nPepperoni 40zł")
                cena += 40
            }
            if(pomidorowy.isChecked){
                result.append("\nSos Pomidorowy 2zł")
                cena += 2
            }
            if(czosnkowy.isChecked){
                result.append("\nSos Czosnkowy 2zł")
                cena += 2
            }
            if(ostry.isChecked){
                result.append("\nSos ostry 2zł")
                cena += 2
            }
            if(lagodny.isChecked){
                result.append("\nSos Łagodny 2zł")
                cena += 2
            }
            if(twysp.isChecked){
                result.append("\nSos 100 Wysp 2zł")
                cena += 2
            }
            result.append("\nCena: " + cena + "zł")
        }
    }
}