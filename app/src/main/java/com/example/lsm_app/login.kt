package com.example.lsm_app

import android.content.Context
import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login.*


class login : AppCompatActivity(R.layout.login) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        sesion()
        autenticar()
    }
private fun sesion(){

    val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)
    val email = prefs.getString("email",null)
    val provedor = prefs.getString("provider",null)
    if(email != null && provedor!=null){
       // loginLayout.visibility = View.INVISIBLE
        ingresar(email, ProviderType.valueOf(provedor))
    }

}




    private fun autenticar(){
        btnRegist.setOnClickListener {
            // startActivity(Intent(this, Registro::class.java))
            if (txtEmail.text.isNotEmpty() && txtPass.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(txtEmail.text.toString(),
                    txtPass.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        ingresar(it.result?.user?.email ?:"",ProviderType.BASIC)
                        Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "ERROR AL GUARDAR", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        btnGuardar.setOnClickListener {
            if (txtEmail.text.isNotEmpty() && txtPass.text.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(txtEmail.text.toString(),
                    txtPass.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        ingresar(it.result?.user?.email ?:"",ProviderType.BASIC)
                    }else{
                        Toast.makeText(this, "ERROR DE AUTENTICACION", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
    private fun ingresar(email: String, provider: ProviderType){
        val homeIntent = Intent(this,MainActivity::class.java).apply {
            putExtra("email",email)
            putExtra("provider",provider.name)
        }
        startActivity(homeIntent)
    }


}