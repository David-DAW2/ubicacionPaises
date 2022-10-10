package com.example.ubicacionpaises

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.ubicacionpaises.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycler.adapter = UbicacionAdapter(ubicaciones = listOf(
            Ubicacion("Paris","https://loremflickr.com/g/320/240/paris","48.85341","2.3488"),
            Ubicacion("Amsterdam","https://loremflickr.com/g/320/240/CityOfAmsterdam","52.374° N","4.8897° E"),
            Ubicacion("Moscú","https://loremflickr.com/g/320/240/Moscu","55.75222","37.61556"),
            Ubicacion("Nueva York","https://loremflickr.com/g/320/240/CityOfNuevaYork","40º 42′ 50 N","74º 00′ 01 W"),
            Ubicacion("Amsterdam","https://loremflickr.com/g/320/240/CityOfAmsterdam","52.374° N","4.8897° E"),
            Ubicacion("Paris","https://loremflickr.com/g/320/240/paris","48º 51' 23'' N","2º 21' 7'' E"),
            Ubicacion("Nueva York","https://loremflickr.com/g/320/240/CityOfNuevaYork","40º 42′ 50 N","74º 00′ 01 W"),
            Ubicacion("Amsterdam","https://loremflickr.com/g/320/240/CityOfAmsterdam","52.374° N","4.8897° E"),
            Ubicacion("Paris","https://loremflickr.com/g/320/240/paris","48º 51' 23'' N","2º 21' 7'' E"),
            Ubicacion("Nueva York","https://loremflickr.com/g/320/240/CityOfNuevaYork","40º 42′ 50 N","74º 00′ 01 W"),
            Ubicacion("Amsterdam","https://loremflickr.com/g/320/240/CityOfAmsterdam","52.374° N","4.8897° E"),
            Ubicacion("Paris","https://loremflickr.com/g/320/240/paris","48º 51' 23'' N","2º 21' 7'' E"),
            Ubicacion("Nueva York","https://loremflickr.com/g/320/240/CityOfNuevaYork","40º 42′ 50 N","74º 00′ 01 W"),
            Ubicacion("Amsterdam","https://loremflickr.com/g/320/240/CityOfAmsterdam","52.374° N","4.8897° E"),


            ),{ ubicacion ->
            val gmmIntentUri = Uri.parse("geo:0,0?q="+ubicacion.latitud+","+ubicacion.longitud)

                // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                    val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                // Make the Intent explicit by setting the Google Maps package
                    mapIntent.setPackage("com.google.android.apps.maps")

                // Attempt to start an activity that can handle the Intent
                  startActivity(mapIntent)



        })
    }
}


