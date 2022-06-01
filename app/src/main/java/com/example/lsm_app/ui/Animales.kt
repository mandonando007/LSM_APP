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

class Animales : Fragment(R.layout.animales) {

    private var animal : String? =  ""


    var miview: View? = null
    var btnAbeja: CardView? = null
    var btnBuho: CardView? = null
    var btnCaballo: CardView? = null
    var btnConejo: CardView? = null
    var btnElefante: CardView? = null
    var btnLeon: CardView? = null
    var btnMono: CardView? = null
    var btnPato: CardView? = null
    var btnPollo: CardView? = null
    var btnBallena: CardView? = null
    var btnArdilla: CardView? = null
    var btnOso: CardView? = null
    var btnPajaro: CardView? = null
    var btnDelfin: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.animales, container, false)
        miview = vista
        btnAbeja = miview?.findViewById(R.id.cardAbeja)
        btnBuho = miview?.findViewById(R.id.cardBuho)
        btnCaballo = miview?.findViewById(R.id.cardCaballo)
        btnConejo = miview?.findViewById(R.id.cardConejo)
        btnElefante = miview?.findViewById(R.id.cardElefante)
        btnLeon = miview?.findViewById(R.id.cardLeon)
        btnMono = miview?.findViewById(R.id.cardMono)
        btnPato = miview?.findViewById(R.id.cardPato)
        btnPollo = miview?.findViewById(R.id.cardPollo)
        btnBallena = miview?.findViewById(R.id.cardBallena)
        btnArdilla = miview?.findViewById(R.id.cardArdilla)
        btnOso = miview?.findViewById(R.id.cardOso)
        btnPajaro = miview?.findViewById(R.id.cardPajaro)
        btnDelfin = miview?.findViewById(R.id.cardDelfin)



        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAbeja?.setOnClickListener {
            animal = "abeja"
            setCurrentFragment(animal!!)
        }
        btnBuho?.setOnClickListener {
            animal = "buho"
            setCurrentFragment(animal!!)
        }
        btnCaballo?.setOnClickListener {
            animal = "caballo"
            setCurrentFragment(animal!!)
        }
        btnConejo?.setOnClickListener {
            animal = "conejo"
            setCurrentFragment(animal!!)
        }
        btnElefante?.setOnClickListener {
            animal = "elefante"
            setCurrentFragment(animal!!)
        }
        btnLeon?.setOnClickListener {
            animal = "leon"
            setCurrentFragment(animal!!)
        }
        btnMono?.setOnClickListener {
            animal = "mono"
            setCurrentFragment(animal!!)
        }
        btnPato?.setOnClickListener {
            animal = "pato"
            setCurrentFragment(animal!!)
        }
        btnPollo?.setOnClickListener {
            animal = "pollo"
            setCurrentFragment(animal!!)
        }
        btnBallena?.setOnClickListener {
            animal = "ballena"
            setCurrentFragment(animal!!)
        }
        btnArdilla?.setOnClickListener {
            animal = "ardilla"
            setCurrentFragment(animal!!)
        }
        btnOso?.setOnClickListener {
            animal = "oso"
            setCurrentFragment(animal!!)
        }
        btnPajaro?.setOnClickListener {
            animal = "pajaro"
            setCurrentFragment(animal!!)
        }
        btnDelfin?.setOnClickListener {
            animal = "delfin"
            setCurrentFragment(animal!!)
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
        fr?.add(R.id.nav_host_fragment_activity_main, frag, "TAG")
        fr?.addToBackStack("TAG")
        fr?.commit()
    }

}