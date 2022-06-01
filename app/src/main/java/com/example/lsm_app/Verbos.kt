
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

        btnConocer = miview?.findViewById(R.id.cardConocer)
        btnEntender = miview?.findViewById(R.id.cardEntender)
        btnGustar = miview?.findViewById(R.id.cardGustar)
        btnHaber= miview?.findViewById(R.id.cardHaber)
        btnQuerer = miview?.findViewById(R.id.cardQuerer)
        btnPoder = miview?.findViewById(R.id.cardPoder)
        btnAbrir = miview?.findViewById(R.id.cardAbril)
        btnAceptar= miview?.findViewById(R.id.cardAceptar)
        btnAburrir = miview?.findViewById(R.id.cardAburir)
        btnAgradecer = miview?.findViewById(R.id.cardAgradecer)
        btnAguantar = miview?.findViewById(R.id.cardAgradecer)
        btnAhogar = miview?.findViewById(R.id.cardNAhogar)
        btnAmar = miview?.findViewById(R.id.Cardamar)
        btnAplastar = miview?.findViewById(R.id.cardAplastar)
        btnAlejar = miview?.findViewById(R.id.CardAlejar)
        btnApoyar= miview?.findViewById(R.id.Cardapoyar)
        btnBailar = miview?.findViewById(R.id.Cardbailar)
        btnAyudar = miview?.findViewById(R.id.CardAyudar)
        btnAvergonzar = miview?.findViewById(R.id.Cardavergonzar)
        btnBañar= miview?.findViewById(R.id.Cardbañar)
        btnBurlar = miview?.findViewById(R.id.Cardburlar)
        btnBuscar = miview?.findViewById(R.id.Cardbuscar)
        btnCalmar = miview?.findViewById(R.id.Cardcalmar)
        btnCaminar = miview?.findViewById(R.id.Cardcaminar)
        btnCantar = miview?.findViewById(R.id.Cardcantar)
        btnComer = miview?.findViewById(R.id.Cardcantar)
        btnComprar = miview?.findViewById(R.id.Cardcomprar)
        btnCorrer = miview?.findViewById(R.id.Cardcorrer)
        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "CONOCER"
        btnConocer?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "ENTENDER"
        btnEntender?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "GUSTAR"
        btnGustar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "HABER"
        btnHaber?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "PODER"
        btnPoder?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "QUERER"
        btnQuerer?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "ABRIR"
        btnAbrir?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "ACEPTAR"
        btnAceptar?.setOnClickListener {
        setCurrentFragment(letraSel!!)
        }
        letraSel = "ABURRIR"
        btnAburrir?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "AGRADECER"
        btnAgradecer?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "AGUANTAR"
        btnAguantar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "AHOGAR"
        btnAhogar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "AMAR"
        btnAmar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "APLASTAR"
        btnAplastar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "ALEJAR"
        btnAlejar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "APOYAR"
        btnApoyar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "BAILAR"
        btnBailar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "AYUDAR"
        btnAyudar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "AVERGANZAR"
        btnAvergonzar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "BAÑAR"
        btnBañar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "BURLAR"
        btnBurlar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "BUSCAR"
        btnBuscar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "CALMAR"
        btnCalmar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "CAMINAR"
        btnCaminar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "CANTAR"
        btnCantar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "COMER"
        btnComer?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "COMPRAR"
        btnComprar?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        letraSel = "CORRER"
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