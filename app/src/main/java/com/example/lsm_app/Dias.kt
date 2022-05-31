
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Dias : Fragment(R.layout.dias) {

    private var letraSel : String? =  ""

    var miview: View? = null
    var btnLunes: CardView? = null
    var btnMartes: CardView? = null
    var btnMiercoles: CardView? = null
    var btnJueves: CardView? = null
    var btnViernes: CardView? = null
    var btnSabado: CardView? = null
    var btnDomingo: CardView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.dias, container, false)
        miview = vista

        btnLunes = miview?.findViewById(R.id.lune)
        btnMartes = miview?.findViewById(R.id.cardNaranja)
        btnMiercoles = miview?.findViewById(R.id.cardAzul)
        btnJueves = miview?.findViewById(R.id.cardCafee)
        btnViernes = miview?.findViewById(R.id.cardGris)
        btnSabado = miview?.findViewById(R.id.cardMorado)
        btnDomingo = miview?.findViewById(R.id.cardRosa)


        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnLunes?.setOnClickListener {
            setCurrentFragment("LUNES"!!)
        }
        btnMartes?.setOnClickListener {
            setCurrentFragment("MARTES"!!)
        }
        btnMiercoles?.setOnClickListener {
            setCurrentFragment("MIERCOLES"!!)
        }
        btnJueves?.setOnClickListener {
            setCurrentFragment("JUEVES"!!)
        }
        btnViernes?.setOnClickListener {
            setCurrentFragment("VIERNES"!!)
        }
        btnSabado?.setOnClickListener {
            setCurrentFragment("SABADO"!!)
        }
        btnDomingo?.setOnClickListener {
            setCurrentFragment("DOMINGO"!!)
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