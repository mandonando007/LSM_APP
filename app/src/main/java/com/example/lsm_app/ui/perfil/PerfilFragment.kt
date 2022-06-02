package com.example.lsm_app.ui.perfil

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lsm_app.AcercaFragment
import com.example.lsm_app.R
import com.example.lsm_app.login

import com.example.lsm_app.videosView
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.fragment_perfil.*
import java.io.File
import java.io.IOException

class PerfilFragment : Fragment() {
    var direccion : String? = "corre"
    var prov : String? = "provedor"
    var miVista : View? = null
    var imgLetra : ImageView? = null
    var videoViw: VideoView?= null
    var btnMisDatos: CardView? = null
    var btnCerrarSesion: CardView? = null
    var btnAcerca: CardView? = null
    var btnEliminar: CardView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val vista = inflater.inflate(R.layout.fragment_perfil, container, false)
        miVista = vista
        imgLetra = miVista?.findViewById(R.id.imgFotoPerfil)
        //videoViw = miVista?.findViewById(R.id.videoView2)
        btnAcerca= miVista?.findViewById(R.id.AcercaDe)
        btnCerrarSesion= miVista?.findViewById(R.id.cerrarSesion)
        btnMisDatos= miVista?.findViewById(R.id.cardColores)
        btnEliminar= miVista?.findViewById(R.id.eliminar)



         obtenerImagen("manos", "manos.png")
         obtenerVideo("durazno","durazno.mp4")



        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtUser.text= direccion

        btnMisDatos?.setOnClickListener {

        }
        btnAcerca?.setOnClickListener {
            setCurrentFragment(AcercaFragment(),"Información")

        }
        btnCerrarSesion?.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent: Intent = Intent(getActivity(), login::class.java)
            startActivity(intent)
        }
        btnEliminar?.setOnClickListener {

        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(arguments != null){
            direccion = arguments?.getString("correo")
            prov = arguments?.getString("provedor")
        }
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
private fun cerrarSesion(){
    FirebaseAuth.getInstance().signOut()

}

    private fun setCurrentFragment(fragment: Fragment, nombre: String){
        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.fragmentContainerView, fragment)
        fr?.addToBackStack(null)
        fr?.commit()

    }
}