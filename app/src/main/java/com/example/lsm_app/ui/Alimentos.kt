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

class Alimentos : Fragment(R.layout.alimentos) {

    private var aliSel : String? =  ""

    var miview: View? = null
    var btnCarne: CardView? = null
    var btnArroz: CardView? = null
    var btnComida: CardView? = null
    var btnHamburgesa: CardView? = null
    var btnAgua: CardView? = null
    var btnEnsalada: CardView? = null
    var btnPostre: CardView? = null
    var btnHuevo: CardView? = null
    var btnChocolate: CardView? = null
    var btnleche: CardView? = null
    var btnPan: CardView? = null
    var btnPastel: CardView? = null
    var btnPollo: CardView? = null
    var btnPescado: CardView? = null
    var btnVino: CardView? = null
    var btnSopa: CardView? = null
    var btnSpaguetti: CardView? = null
    var btnQueso: CardView? = null
    var btnCafe: CardView? = null
    var btnVerdura: CardView? = null
    var btnRefresco: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.alimentos, container, false)
        miview = vista

        btnArroz = miview?.findViewById(R.id.cardArroz)
        btnAgua = miview?.findViewById(R.id.cardAgua)
        btnPescado = miview?.findViewById(R.id.cardPescado)
        btnComida = miview?.findViewById(R.id.cardComida)
        btnEnsalada = miview?.findViewById(R.id.cardEnsalada)
        btnHamburgesa = miview?.findViewById(R.id.cardHamburgesa)
        btnPostre = miview?.findViewById(R.id.cardPostre)
        btnHuevo = miview?.findViewById(R.id.cardHuevo)
        btnChocolate = miview?.findViewById(R.id.cardChocolate)
        btnleche = miview?.findViewById(R.id.cardLeche)
        btnPan = miview?.findViewById(R.id.cardPan)
        btnPastel = miview?.findViewById(R.id.cardPastel)
        btnSopa = miview?.findViewById(R.id.cardNaranja)
        btnCafe = miview?.findViewById(R.id.cardCafe)
        btnPollo = miview?.findViewById(R.id.cardPollo)
        btnSpaguetti = miview?.findViewById(R.id.cardSpaguetti)
        btnVerdura = miview?.findViewById(R.id.cardVerdura)
        btnCarne = miview?.findViewById(R.id.cardCarne)
        btnVino = miview?.findViewById(R.id.cardVino)
        btnRefresco = miview?.findViewById(R.id.cardRefresco)
        btnQueso = miview?.findViewById(R.id.cardQueso)
        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCarne?.setOnClickListener {
            aliSel = "Carne"
            setCurrentFragment(aliSel!!)
        }
        btnArroz?.setOnClickListener {
            aliSel = "Arroz"
            setCurrentFragment(aliSel!!)
        }
        btnComida?.setOnClickListener {
            aliSel = "Comida"
            setCurrentFragment(aliSel!!)
        }
        btnHamburgesa?.setOnClickListener {
            aliSel = "Hamburgesa"
            setCurrentFragment(aliSel!!)
        }
        btnAgua?.setOnClickListener {
            aliSel = "Agua"
            setCurrentFragment(aliSel!!)
        }
        btnEnsalada?.setOnClickListener {
            aliSel = "Ensalada"
            setCurrentFragment(aliSel!!)
        }
        btnPostre?.setOnClickListener {
            aliSel = "Postre"
            setCurrentFragment(aliSel!!)
        }
        btnHuevo?.setOnClickListener {
            aliSel = "Huevo"
            setCurrentFragment(aliSel!!)
        }
        btnChocolate?.setOnClickListener {
            aliSel = "Chocolate"
            setCurrentFragment(aliSel!!)
        }
        btnleche?.setOnClickListener {
            aliSel = "Leche"
            setCurrentFragment(aliSel!!)
        }
        btnPan?.setOnClickListener {
            aliSel = "Pan"
            setCurrentFragment(aliSel!!)
        }
        btnPastel?.setOnClickListener {
            aliSel = "Pastel"
            setCurrentFragment(aliSel!!)
        }
        btnPollo?.setOnClickListener {
            aliSel = "Pollo"
            setCurrentFragment(aliSel!!)
        }
        btnPescado?.setOnClickListener {
            aliSel = "Pescado"
            setCurrentFragment(aliSel!!)
        }
        btnVino?.setOnClickListener {
            aliSel = "Vino"
            setCurrentFragment(aliSel!!)
        }
        btnSopa?.setOnClickListener {
            aliSel = "Sopa"
            setCurrentFragment(aliSel!!)
        }
        btnSpaguetti?.setOnClickListener {
            aliSel = "Espaguetti"
            setCurrentFragment(aliSel!!)
        }
        btnQueso?.setOnClickListener {
            aliSel = "Queso"
            setCurrentFragment(aliSel!!)
        }
        btnCafe?.setOnClickListener {
            aliSel = "Cafe"
            setCurrentFragment(aliSel!!)
        }
        btnVerdura?.setOnClickListener {
            aliSel = "Verdura"
            setCurrentFragment(aliSel!!)
        }
        btnRefresco?.setOnClickListener {
            aliSel = "Refresco"
            setCurrentFragment(aliSel!!)
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