package com.example.lsm_app.ui.videos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.lsm_app.R

import com.example.lsm_app.videosView

class VideosFragment : Fragment(R.layout.fragment_videos) {

    var miview: View? = null
    var btnEstaciones: CardView? = null
    var btnColores: CardView? = null
    var btnVerbos: CardView? = null
    var btnPreguntas: CardView? = null
    var btnTiempo: CardView? = null
    var btnEscuela: CardView? = null
    var btnFamilia: CardView? = null
    var btnDias: CardView? = null
    var btnNumeros: CardView? = null
    var btnMeses: CardView? = null
    var btnSaludos: CardView? = null
    var btnAlfabeto: CardView? = null

    var URL : String  = "";
    var nomVideo : String = ""
    var nomCom: String = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val vista = inflater.inflate(R.layout.fragment_videos, container, false)
        miview = vista
        btnSaludos = miview?.findViewById(R.id.cardSaludos)
        btnAlfabeto = miview?.findViewById(R.id.cardAlfabeto)
        btnDias = miview?.findViewById(R.id.cardDias)
        btnEstaciones = miview?.findViewById(R.id.cardEstaciones)
        btnFamilia = miview?.findViewById(R.id.cardFamilia)
        btnEscuela = miview?.findViewById(R.id.cardEscuela)
        btnMeses = miview?.findViewById(R.id.cardMeses)
        btnNumeros = miview?.findViewById(R.id.cardNumeros)
        btnPreguntas = miview?.findViewById(R.id.cardPreguntas)
        btnTiempo = miview?.findViewById(R.id.cardTiempo)
        btnColores = miview?.findViewById(R.id.cardColores)
        btnVerbos = miview?.findViewById(R.id.cardVerbos)


        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)

        btnSaludos?.setOnClickListener{
            nomVideo = "saludos"
            nomCom = "saludos.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/saludos/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnAlfabeto?.setOnClickListener{
            nomVideo = "alfabeto"
            nomCom = "alfabeto.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/alfabeto/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnDias?.setOnClickListener{
            nomVideo = "dias"
            nomCom = "dias.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/dias/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnEstaciones?.setOnClickListener{
            nomVideo = "estaciones"
            nomCom = "estaciones.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/estaciones/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnFamilia?.setOnClickListener{
            nomVideo = "familia"
            nomCom = "familia.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/familia/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnEscuela?.setOnClickListener{
            nomVideo = "escuela"
            nomCom = "escuela.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/escuela/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnMeses?.setOnClickListener{
            nomVideo = "meses"
            nomCom = "meses.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/meses/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnNumeros?.setOnClickListener{
            nomVideo = "numeros"
            nomCom = "numeros.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/numeros/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnPreguntas?.setOnClickListener{
            nomVideo = "preguntas"
            nomCom = "preguntas.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/preguntas/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnTiempo?.setOnClickListener{
            nomVideo = "tiempo"
            nomCom = "tiempo.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/tiempo/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnColores?.setOnClickListener{
            nomVideo = "colores"
            nomCom = "colores.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/colores/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }

        btnVerbos?.setOnClickListener{
            nomVideo = "verbos"
            nomCom = "verbos.mp4"
            URL = "gs://lsm-app-8708e.appspot.com/verbos/"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL, nomVideo, nomCom)
        }




    }

    private fun setCurrentFragment(url: String,nomVid: String, nomCom: String) {

        val bundle = Bundle()
        bundle.putString("key", url)
        bundle.putString("key1", nomVid)
        bundle.putString("key2", nomCom)
        val fragment = videosView()
        fragment.arguments = bundle

        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.nav_host_fragment_activity_main, fragment)
        fr?.addToBackStack(null)
        fr?.commit()
    }



}