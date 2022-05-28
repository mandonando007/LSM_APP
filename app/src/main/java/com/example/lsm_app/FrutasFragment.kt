package com.example.lsm_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class FrutasFragment : Fragment() {


    var miVista : View? = null
    var miTexto1 : TextView? = null
    var miTexto2 : TextView? = null
    var imgLetra : ImageView? = null

    var Letra : String? = "Letra"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_frutas, container, false)

        miVista = view
        miTexto1 = miVista?.findViewById(R.id.lblLetra)
        miTexto2 = miVista?.findViewById(R.id.lblDescLetr)
        imgLetra = miVista?.findViewById(R.id.imgLetra)


        when(Letra) {
            "Coco" -> {
                miTexto1?.text = "A"
                miTexto2?.text = "Con la mano cerrada, se muestran las uñas y se estira el dedo pulgar hacia un lado. La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.a)

            }
            else -> {}

    }
        return view

  }

}