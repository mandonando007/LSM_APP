
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
        btnMartes = miview?.findViewById(R.id.sopa)
        btnMiercoles = miview?.findViewById(R.id.miercoles)
        btnJueves = miview?.findViewById(R.id.jueves)
        btnViernes = miview?.findViewById(R.id.viernes)
        btnSabado = miview?.findViewById(R.id.sabado)
        btnDomingo = miview?.findViewById(R.id.domingo)


        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnLunes?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnMartes?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnMiercoles?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnJueves?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnViernes?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnSabado?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnDomingo?.setOnClickListener {
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