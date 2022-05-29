
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Numeros : Fragment(R.layout.numeros) {

    private var letraSel : String? =  ""

    var miview: View? = null
    var btnCero: CardView? = null
    var btnUno: CardView? = null
    var btnDos: CardView? = null
    var btnTres: CardView? = null
    var btnCuatro: CardView? = null
    var btnCinco: CardView? = null
    var btnSeis: CardView? = null
    var btnSiete: CardView? = null
    var btnOcho: CardView? = null
    var btnNueve: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.numeros, container, false)
        miview = vista

        btnCero = miview?.findViewById(R.id.cero)
        btnUno = miview?.findViewById(R.id.uno)
        btnDos = miview?.findViewById(R.id.dos)
        btnTres = miview?.findViewById(R.id.tres)
        btnCuatro = miview?.findViewById(R.id.cuatro)
        btnCinco = miview?.findViewById(R.id.cinco)
        btnSeis = miview?.findViewById(R.id.seis)
        btnSiete = miview?.findViewById(R.id.siete)
        btnOcho = miview?.findViewById(R.id.ocho)
        btnNueve = miview?.findViewById(R.id.nueve)

        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnCero?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnUno?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnDos?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnTres?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCuatro?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCinco?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnSeis?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnOcho?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnNueve?.setOnClickListener {
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