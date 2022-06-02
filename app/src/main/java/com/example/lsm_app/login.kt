package com.example.lsm_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        autenticar()
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