package com.example.lsm_app.ui.señas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.content.Context
import android.content.Intent
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.lsm_app.R
import androidx.cardview.widget.CardView
import com.example.lsm_app.Senas
import com.example.lsm_app.databinding.FragmentSenasBinding
import com.example.lsm_app.nav_letras

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

        btnFrutas = miview?.findViewById(R.id.cardfrutas)
        btnVerduras = miview?.findViewById(R.id.verduras)
        btnAlimentos = miview?.findViewById(R.id.alimentos)
        btnColores = miview?.findViewById(R.id.colores)
        btnDias = miview?.findViewById(R.id.cardDias)
        btnAnimales = miview?.findViewById(R.id.animales)
        btnNumeros = miview?.findViewById(R.id.numeros)
        btnMeses = miview?.findViewById(R.id.meses)
        btnVerbos = miview?.findViewById(R.id.Verbos)

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