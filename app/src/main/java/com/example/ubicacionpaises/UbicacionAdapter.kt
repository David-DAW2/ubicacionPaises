package com.example.ubicacionpaises

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ubicacionpaises.databinding.CiudadviewBinding

class UbicacionAdapter(private val ubicaciones: List<Ubicacion>,val listener: (Ubicacion) -> Unit ): RecyclerView.Adapter<UbicacionAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding=CiudadviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ubicacion=ubicaciones[position]
        holder.bind(ubicacion)
        holder.itemView.setOnClickListener {
            listener(ubicacion)
        }
    }
    override fun getItemCount(): Int {
        return ubicaciones.size
    }

    class ViewHolder(private val binding: CiudadviewBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(ubicacion: Ubicacion){

                binding.nombre.text=ubicacion.nombre


                Glide.with(binding.foto)
                    .load(ubicacion.urlImagen)
                    .into(binding.foto)



        }
    }
}