
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Colores : Fragment(R.layout.colores) {

    private var colorSel : String? =  ""

    var miview: View? = null
    var btnAmarillo: CardView? = null
    var btnNaranja: CardView? = null
    var btnAzul: CardView? = null
    var btnCafe: CardView? = null
    var btnGris: CardView? = null
    var btnMorado: CardView? = null
    var btnNegro: CardView? = null
    var btnVerde: CardView? = null
    var btnRosa: CardView? = null
    var btnRojo: CardView? = null
    var btnVioleta: CardView? = null
    var btnPlateado: CardView? = null
    var btnDorado: CardView? = null
    var btnBlanco: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.colores, container, false)
        miview = vista

        btnAmarillo = miview?.findViewById(R.id.cardAmarillo)
        btnNaranja = miview?.findViewById(R.id.cardNaranja)
        btnAzul = miview?.findViewById(R.id.cardAzul)
        btnCafe = miview?.findViewById(R.id.cardCafe)
        btnGris = miview?.findViewById(R.id.cardGris)
        btnMorado = miview?.findViewById(R.id.cardMorado)
        btnNegro = miview?.findViewById(R.id.cardNegro)
        btnVerde = miview?.findViewById(R.id.cardVerde)
        btnRosa = miview?.findViewById(R.id.cardRosa)
        btnRojo = miview?.findViewById(R.id.cardRojo)
        btnVioleta = miview?.findViewById(R.id.cardVioleta)
        btnPlateado = miview?.findViewById(R.id.cardPlateado)
        btnDorado = miview?.findViewById(R.id.cardDorado)
        btnBlanco= miview?.findViewById(R.id.cardBlanco)

        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAmarillo?.setOnClickListener {
            colorSel = "amarillo"
            setCurrentFragment(colorSel!!)
        }
        btnNaranja?.setOnClickListener {
            colorSel = "naranja"
            setCurrentFragment(colorSel!!)
        }
        btnAzul?.setOnClickListener {
            colorSel = "azul"
            setCurrentFragment(colorSel!!)
        }
        btnCafe?.setOnClickListener {
            colorSel = "cafe"
            setCurrentFragment(colorSel!!)
        }
        btnGris?.setOnClickListener {
            colorSel = "gris"
            setCurrentFragment(colorSel!!)
        }
        btnMorado?.setOnClickListener {
            colorSel = "morado"
            setCurrentFragment(colorSel!!)
        }
        btnNegro?.setOnClickListener {
            colorSel = "negro"
            setCurrentFragment(colorSel!!)
        }
        btnVerde?.setOnClickListener {
            colorSel = "verde"
            setCurrentFragment(colorSel!!)
        }
        btnRosa?.setOnClickListener {
            colorSel = "rosa"
            setCurrentFragment(colorSel!!)
        }
        btnRojo?.setOnClickListener {
            colorSel = "rojo"
            setCurrentFragment(colorSel!!)
        }
        btnVioleta?.setOnClickListener {
            colorSel = "violeta"
            setCurrentFragment(colorSel!!)
        }
        btnPlateado?.setOnClickListener {
            colorSel = "plateado"
            setCurrentFragment(colorSel!!)
        }
        btnMorado?.setOnClickListener {
            colorSel = "morado"
            setCurrentFragment(colorSel!!)
        }
        btnBlanco?.setOnClickListener {
            colorSel = "blanco"
            setCurrentFragment(colorSel!!)
        }


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    private fun setCurrentFragment(colSelec : String  ){
        val bundle = Bundle()
        bundle.putString("carLetra", colSelec )
        var frag = nav_letras()
        frag.arguments = bundle
        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.fragmentContainerView, frag)
        fr?.addToBackStack(null)
        fr?.commit()
    }


}