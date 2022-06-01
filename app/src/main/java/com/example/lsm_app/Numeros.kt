
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Numeros : Fragment(R.layout.numeros) {

    private var numSel : String? =  ""

    var miview: View? = null
    var btnUno: CardView? = null
    var btnDos: CardView? = null
    var btnTres: CardView? = null
    var btnCuatro: CardView? = null
    var btnCinco: CardView? = null
    var btnSeis: CardView? = null
    var btnSiete: CardView? = null
    var btnOcho: CardView? = null
    var btnNueve: CardView? = null
    var btnDiez: CardView? = null
    var btnOnce: CardView? = null
    var btnDoce: CardView? = null
    var btnTrece: CardView? = null
    var btnCatorce: CardView? = null
    var btnQuince: CardView? = null
    var btnDieciseis: CardView? = null
    var btnDiecisiete: CardView? = null
    var btnDieciocho: CardView? = null
    var btnDiecinueve: CardView? = null
    var btnVeinte: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.numeros, container, false)
        miview = vista

        btnUno = miview?.findViewById(R.id.cardUno)
        btnDos = miview?.findViewById(R.id.cardDos)
        btnTres = miview?.findViewById(R.id.cardTres)
        btnCuatro = miview?.findViewById(R.id.cardCuatro)
        btnCinco = miview?.findViewById(R.id.cardCinco)
        btnSeis = miview?.findViewById(R.id.cardSeis)
        btnSiete = miview?.findViewById(R.id.cardSiete)
        btnOcho = miview?.findViewById(R.id.cardOcho)
        btnNueve = miview?.findViewById(R.id.cardNueve)
        btnDiez = miview?.findViewById(R.id.cardDiez)
        btnOnce = miview?.findViewById(R.id.cardOnce)
        btnDoce = miview?.findViewById(R.id.cardDoce)
        btnTrece = miview?.findViewById(R.id.cardTrece)
        btnCatorce = miview?.findViewById(R.id.cardCatorce)
        btnQuince = miview?.findViewById(R.id.cardQuince)
        btnDieciseis = miview?.findViewById(R.id.cardDieciseis)
        btnDiecisiete = miview?.findViewById(R.id.cardDiecisiete)
        btnDieciocho = miview?.findViewById(R.id.cardDieciocho)
        btnDiecinueve = miview?.findViewById(R.id.cardDiecinueve)
        btnVeinte = miview?.findViewById(R.id.cardVeinte)


        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btnUno?.setOnClickListener {
            numSel = "1"
            setCurrentFragment(numSel!!)
        }
        btnDos?.setOnClickListener {
            numSel = "2"
            setCurrentFragment(numSel!!)
        }
        btnTres?.setOnClickListener {
            numSel = "3"
            setCurrentFragment(numSel!!)
        }
        btnCuatro?.setOnClickListener {
            numSel = "4"
            setCurrentFragment(numSel!!)
        }
        btnCinco?.setOnClickListener {
            numSel = "5"
            setCurrentFragment(numSel!!)
        }
        btnSeis?.setOnClickListener {
            numSel = "6"
            setCurrentFragment(numSel!!)
        }
        btnSiete?.setOnClickListener {
            numSel = "7"
            setCurrentFragment(numSel!!)
        }
        btnOcho?.setOnClickListener {
            numSel = "8"
            setCurrentFragment(numSel!!)
        }
        btnNueve?.setOnClickListener {
            numSel = "9"
            setCurrentFragment(numSel!!)
        }
        btnDiez?.setOnClickListener {
            numSel = "10"
            setCurrentFragment(numSel!!)
        }
        btnOnce?.setOnClickListener {
            numSel = "11"
            setCurrentFragment(numSel!!)
        }
        btnDoce?.setOnClickListener {
            numSel = "12"
            setCurrentFragment(numSel!!)
        }
        btnTrece?.setOnClickListener {
            numSel = "13"
            setCurrentFragment(numSel!!)
        }
        btnCatorce?.setOnClickListener {
            numSel = "14"
            setCurrentFragment(numSel!!)
        }
        btnQuince?.setOnClickListener {
            numSel = "15"
            setCurrentFragment(numSel!!)
        }
        btnDieciseis?.setOnClickListener {
            numSel = "16"
            setCurrentFragment(numSel!!)
        }
        btnDiecisiete?.setOnClickListener {
            numSel = "17"
            setCurrentFragment(numSel!!)
        }
        btnDieciocho?.setOnClickListener {
            numSel = "18"
            setCurrentFragment(numSel!!)
        }
        btnDiecinueve?.setOnClickListener {
            numSel = "19"
            setCurrentFragment(numSel!!)
        }
        btnVeinte?.setOnClickListener {
            numSel = "20"
            setCurrentFragment(numSel!!)
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
        fr?.replace(R.id.fragmentContainerView, frag)
        fr?.addToBackStack(null)
        fr?.commit()
    }


}