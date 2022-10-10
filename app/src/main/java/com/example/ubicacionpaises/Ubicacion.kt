package com.example.ubicacionpaises

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ubicacion(val nombre:String,val urlImagen:String, val latitud:String, val longitud:String) : Parcelable {
}