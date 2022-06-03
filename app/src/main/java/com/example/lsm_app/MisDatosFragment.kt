package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.fragment_mis_datos.*

class MisDatosFragment : Fragment() {

    private val db = FirebaseFirestore.getInstance()
    var emai: String? = "email"
    var prov: String? = "prov"
    var miVista : View? = null
    var miTexto1 : TextView? = null
    var miTexto2 : TextView? = null
    var butonGuardar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        miVista  =  inflater.inflate(R.layout.fragment_mis_datos, container, false)

        butonGuardar = miVista?.findViewById(R.id.btnGuardar)

        return miVista

           }

    private fun guardar(email:String, provider: String){
        if(txtNombre.text.isNotEmpty()){
            db.collection("usuarios").document(email).set(
                hashMapOf("provedor" to provider, "nombre" to txtNombre.text.toString()))
            Toast.makeText(context, "Guardado", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "Por Favor complete la informacion",Toast.LENGTH_SHORT).show()
        }

    }
    private fun recuperar(email:String, provider: String){
        db.collection("usuarios").document(email).get().addOnSuccessListener {
            txtNombre.setText(it.get("nombre")as String?)
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtEmail.text = emai
        txtProvedor.text = prov
        recuperar(emai ?: "", prov ?:"")
        butonGuardar?.setOnClickListener {
            guardar(emai ?:"",prov ?:"")
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (arguments != null) {
            emai = arguments?.getString("email")
            prov = arguments?.getString("proved")
        }
    }
}