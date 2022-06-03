package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lsm_app.databinding.ActivityMainBinding
import com.example.lsm_app.ui.perfil.PerfilFragment
import com.example.lsm_app.ui.señas.SeñasFragment
import com.example.lsm_app.ui.videos.VideosFragment
import kotlinx.android.synthetic.main.activity_main.*
//import com.example.lsm_app.ui.perfil.PerfilFragment
//import com.example.lsm_app.ui.señas.SeñasFragment
//import com.example.lsm_app.ui.videos.VideosFragment
enum class ProviderType{
    BASIC
}



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val señas = SeñasFragment()
        val vides = VideosFragment()
        val glosario= nav_glosario()
        val perfil = PerfilFragment()

        val bundle: Bundle? = intent.extras
        val emaill =  bundle?.getString("email")
        val  provedor = bundle?.getString("provider")


        //guardado de datos
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
        prefs.putString("email", emaill)
        prefs.putString("provider", provedor)
        prefs.apply()


        nav_view.setOnNavigationItemSelectedListener {
    when(it.itemId){
        R.id.navigation_perfil ->{

            setup(emaill ?: "",provedor ?:"")

            true
        }
        R.id.navigation_señas ->{
            setCurrentFragment(señas)
            true
        }
        R.id.navigation_videos ->{
            setCurrentFragment(vides)
            true
        }
        R.id.nav_glosario ->{
            setCurrentFragment(glosario)
            true
        }
        else->false
    }

}
        setup(emaill ?: "",provedor ?:"")
    }

    private fun setup(email: String, provider: String){
        val  emaill = email
        val   provedor = provider

        val bundle = Bundle()
        bundle.putString("correo", email)
        bundle.putString("provedor", provider)
        var frag = PerfilFragment()
        frag.arguments = bundle
      setCurrentFragment(frag)
    }

    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
            commit()
        }

    }
}