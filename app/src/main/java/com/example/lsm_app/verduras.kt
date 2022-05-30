
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class verduras : Fragment(R.layout.verduras) {

    private var verduraSel : String? =  ""

    var miview: View? = null
    var btnAceituna: CardView? = null
    var btnAjo: CardView? = null
    var btnCalabaza: CardView? = null
    var btnCamote: CardView? = null
    var btnCebolla: CardView? = null
    var btnChampiñon: CardView? = null
    var btnChayote: CardView? = null
    var btnChile: CardView? = null
    var btnEspinacas: CardView? = null
    var btnPepino: CardView? = null
    var btnMaiz: CardView? = null
    var btnNopal: CardView? = null
    var btnPapa: CardView? = null
    var btnZanahoria: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.verduras, container, false)
        miview = vista

        btnAceituna = miview?.findViewById(R.id.cardAceituna)
        btnAjo = miview?.findViewById(R.id.cardAjo)
        btnCalabaza = miview?.findViewById(R.id.cardCalabaza)
        btnCamote = miview?.findViewById(R.id.cardCamote)
        btnCebolla = miview?.findViewById(R.id.cardCebolla)
        btnChampiñon = miview?.findViewById(R.id.cardChampiñon)
        btnChayote = miview?.findViewById(R.id.cardChayote)
        btnPapa = miview?.findViewById(R.id.cardPapa)
        btnZanahoria = miview?.findViewById(R.id.cardZanahoria)
        btnChile = miview?.findViewById(R.id.cardChile)
        btnEspinacas = miview?.findViewById(R.id.cardEspinacas)
        btnPepino = miview?.findViewById(R.id.cardPepino)
        btnMaiz = miview?.findViewById(R.id.cardElote)
        btnNopal = miview?.findViewById(R.id.cardNopal)

        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAceituna?.setOnClickListener {
            verduraSel = "aceituna"
            setCurrentFragment(verduraSel!!)
        }
        btnAjo?.setOnClickListener {
            verduraSel = "ajo"
            setCurrentFragment(verduraSel!!)
        }
        btnCalabaza?.setOnClickListener {
            verduraSel = "calabaza"
            setCurrentFragment(verduraSel!!)
        }
        btnCamote?.setOnClickListener {
            verduraSel = "camote"
            setCurrentFragment(verduraSel!!)
        }
        btnCebolla?.setOnClickListener {
            verduraSel = "cebolla"
            setCurrentFragment(verduraSel!!)
        }
        btnChampiñon?.setOnClickListener {
            verduraSel = "champinon"
            setCurrentFragment(verduraSel!!)
        }
        btnChayote?.setOnClickListener {
            verduraSel = "chayote"
            setCurrentFragment(verduraSel!!)
        }
        btnPepino?.setOnClickListener {
            verduraSel = "pepino"
            setCurrentFragment(verduraSel!!)
        }
        btnPapa?.setOnClickListener {
            verduraSel = "papa"
            setCurrentFragment(verduraSel!!)
        }
        btnZanahoria?.setOnClickListener {
            verduraSel = "zanahoria"
            setCurrentFragment(verduraSel!!)
        }
        btnChile?.setOnClickListener {
            verduraSel = "chile"
            setCurrentFragment(verduraSel!!)
        }
        btnEspinacas?.setOnClickListener {
            verduraSel = "espinacas"
            setCurrentFragment(verduraSel!!)
        }
        btnMaiz?.setOnClickListener {
            verduraSel = "maiz"
            setCurrentFragment(verduraSel!!)
        }
        btnNopal?.setOnClickListener {
            verduraSel = "nopal"
            setCurrentFragment(verduraSel!!)
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