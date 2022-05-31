package com.example.lsm_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Senas : Fragment() {

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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.senas, container, false)
        miview = vista

        btnCoco = miview?.findViewById(R.id.cardArroz)
        btnKiwi = miview?.findViewById(R.id.cardAgua)
        btnDurazno = miview?.findViewById(R.id.cardEnsalada)
        btnFresa = miview?.findViewById(R.id.cardHamburgesa)
        btnGuayaba = miview?.findViewById(R.id.cardPostre)
        btnLimon = miview?.findViewById(R.id.cardHuevo)
        btnMandarina = miview?.findViewById(R.id.cardChocolate)
        btnMango = miview?.findViewById(R.id.cardLeche)
        btnManzana = miview?.findViewById(R.id.cardPan)
        btnmelon = miview?.findViewById(R.id.cardPastel)
        btnNaranja = miview?.findViewById(R.id.cardSopa)
        btnPiña = miview?.findViewById(R.id.cardCafe)
        btnPapaya = miview?.findViewById(R.id.cardPollo)
        btnPera = miview?.findViewById(R.id.cardSpaguetti)
        btnPlatano = miview?.findViewById(R.id.cardQueso)
        btnSandia = miview?.findViewById(R.id.cardVerdura)
        btnUva = miview?.findViewById(R.id.cardCarne)
        btnPitaya = miview?.findViewById(R.id.cardVino)
        btnMora = miview?.findViewById(R.id.cardRefresco)
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