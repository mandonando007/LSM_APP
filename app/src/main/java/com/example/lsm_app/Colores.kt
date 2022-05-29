
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Colores : Fragment(R.layout.colores) {

    private var letraSel : String? =  ""

    var miview: View? = null
    var btnAmarillo: CardView? = null
    var btnNaranj: CardView? = null
    var btnAzul: CardView? = null
    var btnCafe: CardView? = null
    var btnGris: CardView? = null
    var btnMorado: CardView? = null
    var btnNegro: CardView? = null
    var btnVerde: CardView? = null
    var btnRosa: CardView? = null
    var btnRojo: CardView? = null
    var btnVioleta: CardView? = null
    var btnAzulC: CardView? = null
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

        btnAmarillo = miview?.findViewById(R.id.arroz)
        btnNaranj = miview?.findViewById(R.id.cereal)
        btnAzul = miview?.findViewById(R.id.ensalada)
        btnCafe = miview?.findViewById(R.id.hamburgesa)
        btnGris = miview?.findViewById(R.id.helado)
        btnMorado = miview?.findViewById(R.id.huevo)
        btnNegro = miview?.findViewById(R.id.jugo)
        btnVerde = miview?.findViewById(R.id.leche)
        btnRosa = miview?.findViewById(R.id.pan)
        btnRojo = miview?.findViewById(R.id.papasFritas)
        btnVioleta = miview?.findViewById(R.id.sopa)
        btnAzulC = miview?.findViewById(R.id.cafe)
        btnDorado = miview?.findViewById(R.id.pollo)
        btnBlanco= miview?.findViewById(R.id.spaguetti)

        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnAmarillo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnNaranj?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAzul?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCafe?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnGris?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnMorado?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnNegro?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnVerde?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnRosa?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnRojo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnVioleta?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAzulC?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnMorado?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnBlanco?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    private fun setCurrentFragment(ltrSelec : String  ){
        val bundle = Bundle()
        bundle.putString("carLetra", ltrSelec )
        var frag = nav_letras()
        frag.arguments = bundle
        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.nav_host_fragment_activity_main, frag)
        fr?.addToBackStack(null)
        fr?.commit()
    }


}