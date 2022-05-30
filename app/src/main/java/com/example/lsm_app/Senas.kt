package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Senas : Fragment(R.layout.senas) {

    private var letraSel : String? =  ""

    var miview: View? = null
    var btnCoco: CardView? = null
    var btnKiwi: CardView? = null
    var btnDurazno: CardView? = null
    var btnFresa: CardView? = null
    var btnGuayaba: CardView? = null
    var btnLimon: CardView? = null
    var btnMandarina: CardView? = null
    var btnMango: CardView? = null
    var btnSandia: CardView? = null
    var btnUva: CardView? = null
    var btnPitaya: CardView? = null
    var btnMora: CardView? = null
    var btnCereza: CardView? = null
    var btnManzana: CardView? = null
    var btnmelon: CardView? = null
    var btnNaranja: CardView? = null
    var btnPiña: CardView? = null
    var btnPapaya: CardView? = null
    var btnPera: CardView? = null
    var btnPlatano: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.senas, container, false)
        miview = vista

        btnCoco = miview?.findViewById(R.id.arroz)
        btnKiwi = miview?.findViewById(R.id.cereal)
        btnDurazno = miview?.findViewById(R.id.ensalada)
        btnFresa = miview?.findViewById(R.id.hamburgesa)
        btnGuayaba = miview?.findViewById(R.id.helado)
        btnLimon = miview?.findViewById(R.id.huevo)
        btnMandarina = miview?.findViewById(R.id.jugo)
        btnMango = miview?.findViewById(R.id.leche)
        btnManzana = miview?.findViewById(R.id.pan)
        btnmelon = miview?.findViewById(R.id.papasFritas)
        btnNaranja = miview?.findViewById(R.id.sopa)
        btnPiña = miview?.findViewById(R.id.cafe)
        btnPapaya = miview?.findViewById(R.id.pollo)
        btnPera = miview?.findViewById(R.id.spaguetti)
        btnPlatano = miview?.findViewById(R.id.taco)
        btnSandia = miview?.findViewById(R.id.tortilla)
        btnUva = miview?.findViewById(R.id.carne)
        btnPitaya = miview?.findViewById(R.id.pizza)
        btnMora = miview?.findViewById(R.id.refresco)
        btnCereza = miview?.findViewById(R.id.torta)
        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnCoco?.setOnClickListener {
            setCurrentFragment("COCO"!!)
        }
        btnKiwi?.setOnClickListener {
            setCurrentFragment("MAMEY"!!)
        }
        btnDurazno?.setOnClickListener {
            setCurrentFragment("DURAZNO"!!)
        }
        btnFresa?.setOnClickListener {
            setCurrentFragment("FRESA"!!)
        }
        btnGuayaba?.setOnClickListener {
            setCurrentFragment("CAÑA"!!)
        }
        btnLimon?.setOnClickListener {
            setCurrentFragment("LIMON"!!)
        }
        btnMandarina?.setOnClickListener {
            setCurrentFragment("MANDARINA"!!)
        }
        btnMango?.setOnClickListener {
            setCurrentFragment("MANGO"!!)
        }
        btnManzana?.setOnClickListener {
            setCurrentFragment("MANZANA"!!)
        }
        btnmelon?.setOnClickListener {
            setCurrentFragment("MELON"!!)
        }
        btnNaranja?.setOnClickListener {
            setCurrentFragment("NARANJA"!!)
        }
        btnPiña?.setOnClickListener {
            setCurrentFragment("PIÑA"!!)
        }
        btnPapaya?.setOnClickListener {
            setCurrentFragment("PAPAYA"!!)
        }
        btnPera?.setOnClickListener {
            setCurrentFragment("PERA"!!)
        }
        btnPlatano?.setOnClickListener {
            setCurrentFragment("PLATANO"!!)
        }
        btnSandia?.setOnClickListener {
            setCurrentFragment("SANDIA"!!)
        }
        btnUva?.setOnClickListener {
            setCurrentFragment("UVA"!!)
        }
        btnPitaya?.setOnClickListener {
            setCurrentFragment("LIMA"!!)
        }
        btnMora?.setOnClickListener {
            setCurrentFragment("TORONJA"!!)
        }
        btnCereza?.setOnClickListener {
            setCurrentFragment("CEREZA"!!)
        }


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    private fun setCurrentFragment(ltrSelec : String  ){
        val bundle = Bundle()
        bundle.putString("carLetra", ltrSelec )
        var frag = FrutasFragment()
        frag.arguments = bundle
        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.nav_host_fragment_activity_main, frag)
        fr?.addToBackStack(null)
        fr?.commit()
    }


}