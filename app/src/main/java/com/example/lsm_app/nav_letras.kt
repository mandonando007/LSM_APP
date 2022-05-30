package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class nav_letras : Fragment(R.layout.fragment_nav_letras) {


    var miVista : View? = null
    var miTexto1 : TextView? = null
    var miTexto2 : TextView? = null
    var imgLetra : ImageView? = null

    var Letra : String? = "Letra"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_nav_letras, container, false)

        miVista = view
        miTexto1 = miVista?.findViewById(R.id.lblLetra)
        miTexto2 = miVista?.findViewById(R.id.lblDescLetr)
        imgLetra = miVista?.findViewById(R.id.imgLetra)


        when(Letra) {
            //Letras----------------------------------------------------------
            "A" -> {
                miTexto1?.text = "A"
                miTexto2?.text = "Con la mano cerrada, se muestran las uñas y se estira el dedo pulgar hacia un lado. La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.a)

            }
            "B" -> {
                miTexto1?.text = "B"
                miTexto2?.text = "Los dedos indice, medio, anular y meñique se estiran bien unidos y el pulgar se dobla hacia la palma, la cual mira al frente."
                imgLetra?.setImageResource(R.drawable.b)

            }
            "C" -> {
                miTexto1?.text = "C"
                miTexto2?.text = "Los dedos índice, medio y anular y meñique se mantienen bien unidos y en posición cóncava, el pulgar también se pone en esa posición. La palma mira a un lado."
                imgLetra?.setImageResource(R.drawable.c)


            }
            "D" -> {
                miTexto1?.text = "D"
                miTexto2?.text = "Los dedos medio, anular, meñique y pulgar se unen por las puntas y el dedo índice se estira. La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.d)

            }
            "E" -> {
                miTexto1?.text = "E"
                miTexto2?.text = "Se doblan los dedos completamente, y se muestran las uñas. La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.e)

            }
            "F" -> {
                miTexto1?.text = "F"
                miTexto2?.text = "Con la mano abierta y los dedos bien unidos, se dobla el índice hasta que su parte lateral toque la yema del pulgar. La palma mira a un lado."
                imgLetra?.setImageResource(R.drawable.f)

            }
            "G" -> {
                miTexto1?.text = "G"
                miTexto2?.text = "Se cierra la mano y los dedos índice y pulgar se estiran. La palma mira hacia ti."
                imgLetra?.setImageResource(R.drawable.g)

            }
            "H" -> {
                miTexto1?.text = "H"
                miTexto2?.text = "Con la mano cerrada y los dedos índice y medio bien estirados y unidos, se extiende el dedo pulgar señalando hacia arriba. La palma mira hacia ti."
                imgLetra?.setImageResource(R.drawable.h)

            }
            "I" -> {
                miTexto1?.text = "I"
                miTexto2?.text = "Con la mano cerrada, el dedo meñique se estira señalando hacia arriba. La palma se pone de lado."
                imgLetra?.setImageResource(R.drawable.i)

            }
            "J" -> {
                miTexto1?.text = "J"
                miTexto2?.text = "Con la mano cerrada, el dedo meñique bien estirado señalando hacia arriba y la palma a un lado dibuja una J en el aire."
                imgLetra?.setImageResource(R.drawable.j)

            }
            "K" -> {
                miTexto1?.text = "K"
                miTexto2?.text = "Se cierra la mano con los dedos índice, medio y pulgar estirados. La yema del pulgar se pone entre el índice y el medio." +
                        "Se mueve la muñeca hacia arriba."
                imgLetra?.setImageResource(R.drawable.k)
            }
            "L" -> {
                miTexto1?.text = "L"
                miTexto2?.text = "Con la mano cerrada y los dedos índice y pulgar estirados, se forma una L." +
                        "La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.l)

            }
            "LL" -> {
                miTexto1?.text = "LL"
                miTexto2?.text = "Con la mano cerrada y los dedos índice y pulgar estirados, se forma una L." +
                        "La palma mira al frente y se mueve la mano de un lado a otro."
                imgLetra?.setImageResource(R.drawable.l)

            }
            "M" -> {
                miTexto1?.text = "M"
                miTexto2?.text = "Con la mano cerrada, se ponen los dedos índice y pulgar, medio y anular sobre el pulgar."
                imgLetra?.setImageResource(R.drawable.m)
            }
            "N" -> {
                miTexto1?.text = "N"
                miTexto2?.text = "Con la mano cerrada, se ponen los dedos índice y medio sobre el pulgar."
                imgLetra?.setImageResource(R.drawable.n)
            }
            "Ñ" -> {
                miTexto1?.text = "Ñ"
                miTexto2?.text = "Con la mano cerrada, se ponen los dedos índice y medio sobre el pulgar. Se mueve la muñeca a los lados."
                imgLetra?.setImageResource(R.drawable.n2)
            }
            "O" -> {
                miTexto1?.text = "O"
                miTexto2?.text = "Con la mano se forma una letra O. Todos los dedos se tocan por las puntas."
                imgLetra?.setImageResource(R.drawable.o)

            }
            "P" -> {
                miTexto1?.text = "P"
                miTexto2?.text = "Con la mano cerrada y los dedos índice, medio y pulgar estirados, se pone la yema del pulgar entre el índice y el medio."
                imgLetra?.setImageResource(R.drawable.p)
            }
            "Q" -> {
                miTexto1?.text = "Q"
                miTexto2?.text = "Con la mano cerrada, se ponen los dedos índice y pulgar en posición de garra." +
                        "La Palma mira hacia abajo, y se mueve la muñeca hacia los lados."
                imgLetra?.setImageResource(R.drawable.q)
            }
            "R" -> {
                miTexto1?.text = "R"
                miTexto2?.text = "Con la mano cerrada, se estiran y estrlazan los dedos índice y medio. La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.r)
            }
            "RR" -> {
                miTexto1?.text = "RR"
                miTexto2?.text = "Con la mano cerrada, se estiran y entrelazan los dedos índice y medio." +
                        "La palma mira al frente y se mueve la mano de un lado a otro."
                imgLetra?.setImageResource(R.drawable.r)
            }
            "S" -> {
                miTexto1?.text = "S"
                miTexto2?.text = "Con la mano cerrada, se pone el pulgar sobre los otros dedos. La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.s)
            }
            "T" -> {
                miTexto1?.text = "T"
                miTexto2?.text = "Con la mano cerrada, el pulgar se pone entre el índice y el medio." +
                        "La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.t)
            }
            "U" -> {
                miTexto1?.text = "U"
                miTexto2?.text = "Con la mano cerrada, se estiran los dedos índice y medio unidos." +
                        "La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.u)
            }
            "V" -> {
                miTexto1?.text = "V"
                miTexto2?.text = "Con la mano cerrada, se estiran los dedos índice y medio separados." +
                        "La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.v)
            }
            "W" -> {
                miTexto1?.text = "W"
                miTexto2?.text = "Con la mano cerrada, se estiran los dedos índice, medio y anular separados." +
                        "La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.w)
            }
            "X" -> {
                miTexto1?.text = "X"
                miTexto2?.text = "Con la mano cerrada, el índice y el pulgar en posición de garra y la palma dirigida a un lado, " +
                        "se realiza un movimiento al frente y de regreso."
                imgLetra?.setImageResource(R.drawable.x)
            }
            "Y" -> {
                miTexto1?.text = "Y"
                miTexto2?.text = "Con la mano cerrada, se estiran el meñique y el pulgar. La palma mira hacia ti.."
                imgLetra?.setImageResource(R.drawable.y)
            }
            "Z" -> {
                miTexto1?.text = "Z"
                miTexto2?.text = "Con la mano cerrada, el dedo índice estirado y la palma al frente, se dibuja una letra Z en el aire.."
                imgLetra?.setImageResource(R.drawable.z)
            }
            //Meses------------------------------------------------------------
            "Enero" -> {
                miTexto1?.text = "Enero"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.enero)
            }
            "Febrero" -> {
                miTexto1?.text = "Febrero"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.febrero)
            }
            "Marzo" -> {
                miTexto1?.text = "Marzo"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.marzo)
            }
            "Abril" -> {
                miTexto1?.text = "Abril"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.abril)
            }
            "Mayo" -> {
                miTexto1?.text = "Mayo"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.mayo)
            }
            "Junio" -> {
                miTexto1?.text = "Junio"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.junio)
            }
            "Julio" -> {
                miTexto1?.text = "Julio"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.julio)
            }
            "Agosto" -> {
                miTexto1?.text = "Agosto"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.agosto)
            }
            "Septiembre" -> {
                miTexto1?.text = "Septiembre"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.septiembre)
            }
            "Octubre" -> {
                miTexto1?.text = "Octubre"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.octubre)
            }
            "Noviembre" -> {
                miTexto1?.text = "Noviembre"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.noviembre)
            }
            "Diciembre" -> {
                miTexto1?.text = "Diciembre"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.diciembre)
            }
            //Animales------------------------------------------------------
            "abeja" -> {
                miTexto1?.text = "Abeja"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.abejasen)
            }
            "buho" -> {
                miTexto1?.text = "Buho"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.buhosen)
            }
            "caballo" -> {
                miTexto1?.text = "Caballo"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.caballosen)
            }
            "conejo" -> {
                miTexto1?.text = "Conejo"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.conejosen)
            }
            "elefante" -> {
                miTexto1?.text = "Elefante"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.elefantesen)
            }
            "leon" -> {
                miTexto1?.text = "Leon"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.leonsen)
            }
            "mono" -> {
                miTexto1?.text = "Mono"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.monosen)
            }
            "pato" -> {
                miTexto1?.text = "Pato"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.patosen)
            }
            "pollo" -> {
                miTexto1?.text = "Pollo"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.pollosen)
            }
            "ballena" -> {
                miTexto1?.text = "Ballena"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.ballenasen)
            }
            "ardilla" -> {
                miTexto1?.text = "Ardilla"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.ardillasen)
            }
            "oso" -> {
                miTexto1?.text = "Oso"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.ososen)
            }
            "pajaro" -> {
                miTexto1?.text = "Pajaro"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.pajarosen)
            }
            "delfin" -> {
                miTexto1?.text = "Delfin"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.delfinsen)
            }
            //Verduras------------------------------------------------------
            "aceituna" -> {
                miTexto1?.text = "Aceituna"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.aceitunasen)
            }
            "ajo" -> {
                miTexto1?.text = "Ajo"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.ajosen)
            }
            "calabaza" -> {
                miTexto1?.text = "Calabaza"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.calabacitasen)
            }
            "camote" -> {
                miTexto1?.text = "Camote"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.camotesen)
            }
            "cebolla" -> {
                miTexto1?.text = "Cebolla"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.cebollasen)
            }
            "champinon" -> {
                miTexto1?.text = "Champiñon"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.campinonsen)
            }
            "chayote" -> {
                miTexto1?.text = "Chayote"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.chayotesen)
            }
            "pepino" -> {
                miTexto1?.text = "Pepino"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.pepinosen)
            }
            "papa" -> {
                miTexto1?.text = "Papa"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.papassen)
            }
            "zanahoria" -> {
                miTexto1?.text = "Zanahoria"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.zanahoriasen)
            }
            "chile" -> {
                miTexto1?.text = "Chile"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.delfinsen)
            }
            "espinacas" -> {
                miTexto1?.text = "Espinacas"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.espinacassen)
            }
            "maiz" -> {
                miTexto1?.text = "Maiz"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.elotesen)
            }
            "nopal" -> {
                miTexto1?.text = "Nopal"
                miTexto2?.text = ""
                imgLetra?.setImageResource(R.drawable.nopalsen)
            }
            else -> {}
        }//Del when
        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }//-------------------------------------- Termina el OnViewCreated
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(arguments != null){
            Letra = arguments?.getString("carLetra")
        }
        var fr = nav_letras().getFragmentManager()?.beginTransaction()
        fr?.addToBackStack(null)
        fr?.commit()
    }
} //Del fragment
