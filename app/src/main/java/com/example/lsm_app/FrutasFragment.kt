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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

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
            "Coco" -> {
                miTexto1?.text = "A"
                miTexto2?.text = "Con la mano cerrada, se muestran las uñas y se estira el dedo pulgar hacia un lado. La palma mira al frente."
                imgLetra?.setImageResource(R.drawable.coco)
            }
            else -> {}

    }
        return view

  }

    override fun onAttach(context: Context) {
        super.onAttach(context)
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