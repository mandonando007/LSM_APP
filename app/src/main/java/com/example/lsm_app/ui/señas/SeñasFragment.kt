package com.example.lsm_app.ui.señas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.lsm_app.R
import androidx.cardview.widget.CardView
import com.example.lsm_app.Senas

class SeñasFragment : Fragment(R.layout.fragment_senas) {
    var imagen: ImageView? = null
    var miview: View? = null
    var btnFrutas: CardView? = null
    var btnVerduras: CardView? = null
    var btnAlimentos: CardView? = null
    var btnColores: CardView? = null
    var btnDias: CardView? = null
    var btnAnimales: CardView? = null
    var btnNumeros: CardView? = null
    var btnMeses: CardView? = null
    var btnVerbos: CardView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         val vista = inflater.inflate(R.layout.fragment_senas, container, false)
        miview = vista

        btnFrutas = miview?.findViewById(R.id.cardVerbos)
        btnVerduras = miview?.findViewById(R.id.cardPreguntas)
        btnAlimentos = miview?.findViewById(R.id.cardTiempo)
        btnColores = miview?.findViewById(R.id.cardEscuela)
        btnDias = miview?.findViewById(R.id.cardFamilia)
        btnAnimales = miview?.findViewById(R.id.cardDias)
        btnNumeros = miview?.findViewById(R.id.cardNumeros)
        btnMeses = miview?.findViewById(R.id.cardMeses)
        btnVerbos = miview?.findViewById(R.id.cardAlfabeto)

        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnFrutas?.setOnClickListener{
            setCurrentFragment(Senas())
        }
        btnVerduras?.setOnClickListener{
            setCurrentFragment(Senas())
        }
        btnAlimentos?.setOnClickListener{
            setCurrentFragment(Senas())
        }
        btnColores?.setOnClickListener{
            setCurrentFragment(Senas())
        }
        btnDias?.setOnClickListener{
            setCurrentFragment(Senas())
        }
        btnNumeros?.setOnClickListener{
            setCurrentFragment(Senas())
        }
        btnVerbos?.setOnClickListener {
            setCurrentFragment(Senas())
        }
        btnAnimales?.setOnClickListener {
            setCurrentFragment(Senas())
        }
        btnMeses?.setOnClickListener {
            setCurrentFragment(Senas())
        }



    }

    private fun setCurrentFragment(fragment: Fragment ){
        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.nav_host_fragment_activity_main, fragment)
        fr?.addToBackStack(null)
        fr?.commit()
    }
}