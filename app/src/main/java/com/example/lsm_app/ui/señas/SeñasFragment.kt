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

class SeñasFragment : Fragment(R.layout.fragment_senas) {
    var imagen: ImageView? = null
    var miview: View? = null
    var btn: CardView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         val vista = inflater.inflate(R.layout.fragment_senas, container, false)
        miview = vista
        imagen = miview?.findViewById(R.id.imgFrutas)
     //   imagen?.setImageResource(R.drawable.cerrar_sesion)

        miview = vista
        btn = miview?.findViewById(R.id.cardfrutas)
        btn?.setOnClickListener{

        }
        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)






    }


}