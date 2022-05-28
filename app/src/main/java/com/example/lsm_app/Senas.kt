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

        btnCoco = miview?.findViewById(R.id.coco)

        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnCoco?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    private fun setCurrentFragment(ltrSelec : String  ){

        //Le pasamos los datos al fragmento
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