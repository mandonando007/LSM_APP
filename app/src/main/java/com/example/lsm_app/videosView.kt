package com.example.lsm_app

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.IOException


class videosView : Fragment(R.layout.fragment_videos_view) {

    var URL: String = ""
    var nomVid: String = ""
    var nomCom: String = ""
    var videoViw: VideoView?= null
    var miVista : View? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val video = inflater.inflate(R.layout.fragment_videos_view, container, false)
        miVista = video
        videoViw = miVista?.findViewById(R.id.videoView)
        obtenerVideo(nomVid,nomCom)

        return video
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(arguments != null){
            URL = arguments?.getString("key").toString()
            nomVid = arguments?.getString("key1").toString()
            nomCom = arguments?.getString("key2").toString()
        }

    }

    private fun obtenerVideo(nomVid: String, nomCom:String){
        var storage = FirebaseStorage.getInstance()
        var storageRef = storage.getReferenceFromUrl(URL).child(nomCom)
        try {
            val localFile: File = File.createTempFile(nomVid, "mp4")
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