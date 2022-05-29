package com.example.lsm_app.ui.perfil

import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lsm_app.R

import com.example.lsm_app.videosView
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.IOException

class PerfilFragment : Fragment() {

    var miVista : View? = null
    var imgLetra : ImageView? = null
    var videoViw: VideoView?= null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val vista = inflater.inflate(R.layout.fragment_perfil, container, false)
        miVista = vista
        imgLetra = miVista?.findViewById(R.id.imgFotoPerfil)
        videoViw = miVista?.findViewById(R.id.videoView2)
         obtenerImagen("manos", "manos.png")
         obtenerVideo("durazno","durazno.mp4")


        return vista
    }

    private fun obtenerImagen(nomImg: String, nomCom:String){
        var storage = FirebaseStorage.getInstance()
        var storageRef = storage.getReferenceFromUrl("gs://lsm-app-8708e.appspot.com/señas").child(nomCom)
        try {
            val localFile: File = File.createTempFile(nomImg, "png")
            storageRef.getFile(localFile)
                .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                    val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                    imgLetra?.setImageBitmap(bitmap)
                }).addOnFailureListener(OnFailureListener { })
        } catch (e: IOException) {
            Toast.makeText(context, "Error al Cargar la Imagen", Toast.LENGTH_SHORT).show()
        }
    }

    private fun obtenerVideo(nomImg: String, nomCom:String){
        var storage = FirebaseStorage.getInstance()
        var storageRef = storage.getReferenceFromUrl("gs://lsm-app-8708e.appspot.com/frutas").child(nomCom)
        try {
            val localFile: File = File.createTempFile(nomImg, "mp4")
            storageRef.getFile(localFile)
                .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                    videoViw?.setVideoURI(Uri.fromFile(localFile))
                    videoViw?.start()
                }).addOnFailureListener(OnFailureListener { })
        } catch (e: IOException) {
            Toast.makeText(context, "Error al Cargar el Video", Toast.LENGTH_SHORT).show()
        }
    }

}