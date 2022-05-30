package com.example.lsm_app.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.example.lsm_app.R
import com.example.lsm_app.nav_letras

class Alimentos : Fragment(R.layout.alimentos) {

    private var letraSel : String? =  ""

    var miview: View? = null
    var btnCarne: CardView? = null
    var btnArroz: CardView? = null
    var btnHamburgesa: CardView? = null
    var btnCereal: CardView? = null
    var btnEnsalada: CardView? = null
    var btnHelado: CardView? = null
    var btnHuevo: CardView? = null
    var btnJugo: CardView? = null
    var btnleche: CardView? = null
    var btnPan: CardView? = null
    var btnPapas: CardView? = null
    var btnPollo: CardView? = null
    var btnPizza: CardView? = null
    var btnSopa: CardView? = null
    var btnSpaguetti: CardView? = null
    var btnTaco: CardView? = null
    var btnCafe: CardView? = null
    var btnTocino: CardView? = null
    var btnTortilla: CardView? = null
    var btnRefresco: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.alimentos, container, false)
        miview = vista

        btnArroz = miview?.findViewById(R.id.arroz)
        btnCereal = miview?.findViewById(R.id.cereal)
        btnEnsalada = miview?.findViewById(R.id.ensalada)
        btnHamburgesa = miview?.findViewById(R.id.hamburgesa)
        btnHelado = miview?.findViewById(R.id.helado)
        btnHuevo = miview?.findViewById(R.id.huevo)
        btnJugo = miview?.findViewById(R.id.jugo)
        btnleche = miview?.findViewById(R.id.leche)
        btnPan = miview?.findViewById(R.id.pan)
        btnPapas = miview?.findViewById(R.id.papasFritas)
        btnSopa = miview?.findViewById(R.id.sopa)
        btnCafe = miview?.findViewById(R.id.cafe)
        btnPollo = miview?.findViewById(R.id.cardPollo)
        btnSpaguetti = miview?.findViewById(R.id.spaguetti)
        btnTocino = miview?.findViewById(R.id.taco)
        btnTortilla = miview?.findViewById(R.id.tortilla)
        btnCarne = miview?.findViewById(R.id.carne)
        btnPizza = miview?.findViewById(R.id.pizza)
        btnRefresco = miview?.findViewById(R.id.refresco)
        btnTaco = miview?.findViewById(R.id.taco)
        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnCarne?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnArroz?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCereal?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnEnsalada?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnHamburgesa?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnHelado?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnHuevo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnJugo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnleche?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnPan?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnPollo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnPizza?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnSopa?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnSpaguetti?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnTaco?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCafe?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnTortilla?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnRefresco?.setOnClickListener {
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