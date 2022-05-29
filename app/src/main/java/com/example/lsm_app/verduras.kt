
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class verduras : Fragment(R.layout.verduras) {

    private var letraSel : String? =  ""

    var miview: View? = null
    var btnAceitun: CardView? = null
    var btnAjo: CardView? = null
    var btnCalabaza: CardView? = null
    var btnCamote: CardView? = null
    var btnCebolla: CardView? = null
    var btnChampiñon: CardView? = null
    var btnChayote: CardView? = null
    var btnChicharo: CardView? = null
    var btnChile: CardView? = null
    var btnEspinacas: CardView? = null
    var btnLechuga: CardView? = null
    var btnMaiz: CardView? = null
    var btnNopal: CardView? = null
    var btnPapa: CardView? = null
    var btnZanahoria: CardView? = null
    var btnTomate: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.verduras, container, false)
        miview = vista

        btnAceitun = miview?.findViewById(R.id.aceituna)
        btnAjo = miview?.findViewById(R.id.ajo)
        btnCalabaza = miview?.findViewById(R.id.calabaza)
        btnCamote = miview?.findViewById(R.id.camote)
        btnCebolla = miview?.findViewById(R.id.cebolla)
        btnChampiñon = miview?.findViewById(R.id.champiñon)
        btnChayote = miview?.findViewById(R.id.chayote)
        btnChicharo = miview?.findViewById(R.id.chicharos)
        btnPapa = miview?.findViewById(R.id.papas)
        btnZanahoria = miview?.findViewById(R.id.zanahoria)
        btnChile = miview?.findViewById(R.id.chile)
        btnEspinacas = miview?.findViewById(R.id.espinacas)
        btnLechuga = miview?.findViewById(R.id.lechuga)
        btnMaiz = miview?.findViewById(R.id.maiz)
        btnNopal = miview?.findViewById(R.id.nopal)
        btnTomate = miview?.findViewById(R.id.tomate)

        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnAceitun?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAjo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCalabaza?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCamote?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCebolla?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnChampiñon?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnChayote?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnChicharo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnPapa?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnZanahoria?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }

        btnChile?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnEspinacas?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnLechuga?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnMaiz?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnNopal?.setOnClickListener {
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