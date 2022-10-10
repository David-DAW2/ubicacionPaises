package com.example.ubicacionpaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ubicacionpaises.databinding.ActivityUbicacionDetailBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class UbicacionDetail : AppCompatActivity(){
    companion object {
        const val EXTRA_UBICACION= "ubicacionElegida"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacion_detail)
        val binding = ActivityUbicacionDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val ubicacion = intent?.getParcelableExtra<Ubicacion>(EXTRA_UBICACION) ?: throw
        IllegalStateException()





    }


}