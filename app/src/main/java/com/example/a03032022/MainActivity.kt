package com.example.a03032022

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zamow = findViewById<TextView>(R.id.zamow)

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
            var cena: Int = 0

            if(margherita.isChecked){
                zamow.append("\nMargherita 30zł")
                cena += 30
            }
            else if(pepperoni.isChecked){
                zamow.append("\nPepperoni 35zł")
                cena += 35
            }
            else if(capricciosa.isChecked){
                zamow.append("\nCapriciossa 35zł")
                cena += 35
            }
            else if(diavola.isChecked){
                zamow.append("\nDiavola 35zł")
                cena += 35
            }
            else if(vege.isChecked){
                zamow.append("\nPepperoni 40zł")
                cena += 40
            }
            else if(pomidorowy.isChecked){
                zamow.append("\nSos Pomidorowy 2zł")
                cena += 2
            }
            else if(czosnkowy.isChecked){
                zamow.append("\nSos Czosnkowy 2zł")
                cena += 2
            }
            else if(ostry.isChecked){
                zamow.append("\nSos ostry 2zł")
                cena += 2
            }
            else if(lagodny.isChecked){
                zamow.append("\nSos Łagodny 2zł")
                cena += 2
            }
            else if(twysp.isChecked){
                zamow.append("\nSos 100 Wysp 2zł")
                cena += 2
            }
            zamow.append("\n\nCena: " + cena + "zł")
        }
    }
}