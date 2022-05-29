package com.example.lsm_app.ui.señas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.cardview.widget.CardView
import com.example.lsm_app.*
import com.example.lsm_app.ui.Animales

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

        btnFrutas = miview?.findViewById(R.id.cardFrutas)
        btnVerduras = miview?.findViewById(R.id.cardVerduras)
        btnAlimentos = miview?.findViewById(R.id.cardAlimentos)
        btnColores = miview?.findViewById(R.id.cardColores)
        btnDias = miview?.findViewById(R.id.cardDias)
        btnAnimales = miview?.findViewById(R.id.cardAnimales)
        btnNumeros = miview?.findViewById(R.id.cardNumeros)
        btnMeses = miview?.findViewById(R.id.cardMeses)
        btnVerbos = miview?.findViewById(R.id.cardVerbos)

        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnFrutas?.setOnClickListener{
            setCurrentFragment(Senas(),"Bienvenido a las Frutas")
        }
        btnVerduras?.setOnClickListener{
            setCurrentFragment(verduras(),"Bienvenido a las Verduras")
        }
        btnAlimentos?.setOnClickListener{
            setCurrentFragment(Animales(), "Bienvenido a los Alimentos")
        }
        btnColores?.setOnClickListener{
            setCurrentFragment(Colores(), "Bienvenido a los Colores")
        }
        btnDias?.setOnClickListener{
            setCurrentFragment(Dias(), "Bienvenido a los Dias")
        }
        btnNumeros?.setOnClickListener{
            setCurrentFragment(Numeros(),"Bienvenido a los Numeros")
        }
        btnVerbos?.setOnClickListener {
            setCurrentFragment(Animales(), "Bienvenido a los Verbos")
        }
        btnAnimales?.setOnClickListener {
           setCurrentFragment(Animales(), "Bienvenido a los Animales")
        }
        btnMeses?.setOnClickListener {
            setCurrentFragment(Animales(), "Bienvenido a los Meses")
        }
    }

    private fun cambiarIcono(){

    }

    private fun setCurrentFragment(fragment: Fragment, nombre: String){
        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.nav_host_fragment_activity_main, fragment)
        Toast.makeText(context,nombre, Toast.LENGTH_SHORT).show()
        fr?.addToBackStack(null)
        fr?.commit()
    }
}