
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Verbos : Fragment(R.layout.verbs) {

    private var letraSel : String? =  ""

    var miview: View? = null
    var btnConocer: CardView? = null
    var btnEntender: CardView? = null
    var btnGustar: CardView? = null
    var btnHaber: CardView? = null
    var btnQuerer: CardView? = null
    var btnPoder: CardView? = null
    var btnAbrir: CardView? = null
    var btnAceptar: CardView? = null
    var btnAburrir: CardView? = null
    var btnAgradecer: CardView? = null
    var btnAguantar : CardView? = null
    var btnAhogar : CardView? = null
    var btnAplastar: CardView? = null

    var btnAmar: CardView? = null
    var btnAlejar: CardView? = null
    var btnApoyar: CardView? = null
    var btnBailar: CardView? = null
    var btnAyudar: CardView? = null
    var btnAvergonzar: CardView? = null
    var btnBañar: CardView? = null
    var btnBurlar: CardView? = null
    var btnBuscar: CardView? = null
    var btnCalmar : CardView? = null
    var btnCaminar: CardView? = null

    var btnCantar: CardView? = null
    var btnComer: CardView? = null
    var btnComprar: CardView? = null
    var btnCorrer : CardView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.verbs, container, false)
        miview = vista

        btnConocer = miview?.findViewById(R.id.conocer)
        btnEntender = miview?.findViewById(R.id.entender)
        btnGustar = miview?.findViewById(R.id.gustar)
        btnHaber= miview?.findViewById(R.id.haber)
        btnQuerer = miview?.findViewById(R.id.querer)
        btnPoder = miview?.findViewById(R.id.poder)
        btnAbrir = miview?.findViewById(R.id.abrir)
        btnAceptar= miview?.findViewById(R.id.aceptar)
        btnAburrir = miview?.findViewById(R.id.aburrir)
        btnAgradecer = miview?.findViewById(R.id.agradecer)
        btnAguantar = miview?.findViewById(R.id.aguantar)
        btnAhogar = miview?.findViewById(R.id.ahogar)
        btnAmar = miview?.findViewById(R.id.amar)
        btnAplastar = miview?.findViewById(R.id.aplastar)
        btnAlejar = miview?.findViewById(R.id.alejar)
        btnApoyar= miview?.findViewById(R.id.apoyar)
        btnBailar = miview?.findViewById(R.id.bailar)
        btnAyudar = miview?.findViewById(R.id.ayudar)
        btnAvergonzar = miview?.findViewById(R.id.avergonzar)
        btnBañar= miview?.findViewById(R.id.bañar)
        btnBurlar = miview?.findViewById(R.id.burlar)
        btnBuscar = miview?.findViewById(R.id.buscar)
        btnCalmar = miview?.findViewById(R.id.calmar)
        btnCaminar = miview?.findViewById(R.id.caminar)
        btnCantar = miview?.findViewById(R.id.cantar)
        btnComer = miview?.findViewById(R.id.comer)
        btnComprar = miview?.findViewById(R.id.comprar)
        btnCorrer = miview?.findViewById(R.id.correr)




        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnConocer?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnEntender?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnGustar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnHaber?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnPoder?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnQuerer?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAbrir?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAceptar?.setOnClickListener {
        setCurrentFragment(letraSel!!)
        }
        btnAburrir?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }

        btnAgradecer?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAguantar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAhogar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }

        btnAmar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAplastar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAlejar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnApoyar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnBailar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAyudar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAvergonzar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnBañar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnBurlar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnBurlar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCalmar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCaminar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCantar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnComer?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnComprar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnCorrer?.setOnClickListener {
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