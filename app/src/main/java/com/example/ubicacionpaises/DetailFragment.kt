package com.example.ubicacionpaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.ubicacionpaises.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    companion object {
        const val EXTRA_UBICACION= "ubicacionElegida"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentDetailBinding.bind(view)
        val ubicacion = arguments?.getParcelable<Ubicacion>(EXTRA_UBICACION) ?: throw
        IllegalStateException()

    }


}