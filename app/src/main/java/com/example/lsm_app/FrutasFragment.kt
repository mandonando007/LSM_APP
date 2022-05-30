package com.example.lsm_app

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.IOException


class FrutasFragment : Fragment() {

    var miVista : View? = null
    var miTexto1 : TextView? = null
    var miTexto2 : TextView? = null
    var imgLetra : ImageView? = null
    var Letra : String? = "Letra"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_frutas, container, false)

        miVista = view
        miTexto1 = miVista?.findViewById(R.id.lblLetra)
        miTexto2 = miVista?.findViewById(R.id.lblDescLetr)

        imgLetra = miVista?.findViewById(R.id.imgLetra)



        when(Letra) {
            "COCO" -> {
                miTexto1?.text = "COCO"
                imgLetra?.setImageResource(R.drawable.se_acoco)
            }
            "MAMEY" -> {
                miTexto1?.text = "MAMEY"
                imgLetra?.setImageResource(R.drawable.se_amamey)
            }
            "DURAZNO" -> {
                miTexto1?.text = "DURAZNO"
                imgLetra?.setImageResource(R.drawable.se_adurazno)
            }
            "FRESA" -> {
                miTexto1?.text = "FRESA"
                imgLetra?.setImageResource(R.drawable.se_afresa)
            }
            "CAÑA" -> {
                miTexto1?.text = "CAÑA"
                imgLetra?.setImageResource(R.drawable.se_aca_a)
            }
            "LIMON"-> {
                miTexto1?.text = "LIMON"
                imgLetra?.setImageResource(R.drawable.se_alim_n)
            }
            "MANDARINA" -> {
                miTexto1?.text ="MANDARINA"
                imgLetra?.setImageResource(R.drawable.se_amandarina)
            }
            "MANGO" -> {
                miTexto1?.text = "MANGO"
                imgLetra?.setImageResource(R.drawable.se_amango)
            }
            "MANZANA" -> {
                miTexto1?.text = "MANZANA"
                imgLetra?.setImageResource(R.drawable.se_amanzana)
            }
            "MELON" -> {
                miTexto1?.text ="MELON"
                imgLetra?.setImageResource(R.drawable.se_amelon)
            }
            "NARANJA" -> {
                miTexto1?.text = "NARANJA"
                imgLetra?.setImageResource(R.drawable.se_anaranja)
            }
            "PIÑA" -> {
                miTexto1?.text = "PIÑA"
                imgLetra?.setImageResource(R.drawable.se_api_a)
            }
            "PAPAYA" -> {
                miTexto1?.text = "PAPAYA"
                imgLetra?.setImageResource(R.drawable.se_apapaya)
            }
            "PERA" -> {
                miTexto1?.text = "PERA"
                imgLetra?.setImageResource(R.drawable.se_apera)
            }
            "PLATANO" -> {
                miTexto1?.text = "PLATANO"
                imgLetra?.setImageResource(R.drawable.se_aplatano)
            }
            "SANDIA"-> {
                miTexto1?.text = "SANDIA"
                imgLetra?.setImageResource(R.drawable.se_asandia)
            }
            "UVA" -> {
                miTexto1?.text = "UVA"
                imgLetra?.setImageResource(R.drawable.se_auva)
            }
            "TORONJA"-> {
                miTexto1?.text = "TORONJA"
                imgLetra?.setImageResource(R.drawable.se_alima)
            }
            "LIMA"-> {
                miTexto1?.text = "LIMA"
                imgLetra?.setImageResource(R.drawable.se_atoronja)
            }
            "CEREZA"-> {
                miTexto1?.text = "CEREZA"
                imgLetra?.setImageResource(R.drawable.se_acereza)
            }

            "LUNES" -> {
                miTexto1?.text = "LUNES"
                imgLetra?.setImageResource(R.drawable.se_lunes)
            }
            "MARTES" -> {
                miTexto1?.text ="MARTES"
                imgLetra?.setImageResource(R.drawable.se_martes)
            }
            "MIERCOLES"-> {
                miTexto1?.text = "MIERCOLES"
                imgLetra?.setImageResource(R.drawable.se_miercoles)
            }
            "JUEVES" -> {
                miTexto1?.text ="JUEVES"
                imgLetra?.setImageResource(R.drawable.se_jueves)
            }
            "VIERNES"-> {
                miTexto1?.text = "VIERNES"
                imgLetra?.setImageResource(R.drawable.viernes)
            }
            "SABADO" -> {
                miTexto1?.text ="SABADO"
                imgLetra?.setImageResource(R.drawable.se__sabado)
            }
            "DOMINGO"-> {
                miTexto1?.text = "DOMINGO"
                imgLetra?.setImageResource(R.drawable.se_domindo)
            }

            else -> {}

    }
        return view

  }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(context , "+++++++++ Fragmento Frutas ++++++++", Toast.LENGTH_SHORT).show()
    }


    override fun onAttach(context: Context) {
       super.onAttach(context)
        if(arguments != null){
            Letra = arguments?.getString("carLetra")
        }
       // var fr = FrutasFragment().getFragmentManager()?.beginTransaction()
        //fr?.addToBackStack(null)
        //fr?.commit()

    }

    private fun obtenerImagen(nomImg: String){
        var storage = FirebaseStorage.getInstance()
        var storageRef = storage.getReferenceFromUrl("gs://lsm-app-8708e.appspot.com/señas").child(nomImg)
        try {
            val localFile: File = File.createTempFile(nomImg, "png")
            storageRef.getFile(localFile)
                .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                    val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                    imgLetra?.setImageBitmap(bitmap)
                }).addOnFailureListener(OnFailureListener { })
        } catch (e: IOException) {
        }
    }
}