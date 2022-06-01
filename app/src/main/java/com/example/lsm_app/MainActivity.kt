package com.example.lsm_app

import android.os.Bundle
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

class MainActivity : AppCompatActivity() {

//private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        setContentView(R.layout.activity_main)

        val señas = SeñasFragment()
        val vides = VideosFragment()
        val glosario= nav_glosario()
        val perfil = PerfilFragment()


nav_view.setOnNavigationItemSelectedListener {
    when(it.itemId){
        R.id.navigation_perfil ->{

            setCurrentFragment(perfil)
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
    //    val navView: BottomNavigationView = binding.navView



       // val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
       ////   setOf(
           //     R.id.navigation_perfil, R.id.navigation_señas, R.id.navigation_videos, R.id.nav_glosario
            //)
        //)
        //setupActionBarWithNavController(navController, appBarConfiguration)

    //navView.setupWithNavController(navController)
    }

    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
            commit()
        }

    }
}