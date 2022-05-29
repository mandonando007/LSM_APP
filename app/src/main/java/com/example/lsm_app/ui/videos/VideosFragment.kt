package com.example.lsm_app.ui.videos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.lsm_app.R

import com.example.lsm_app.videosView

class VideosFragment : Fragment(R.layout.fragment_videos) {

    var miview: View? = null
    var btnSaludos: CardView? = null

    var URL : String  = "";

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val vista = inflater.inflate(R.layout.fragment_videos, container, false)
        miview = vista
        btnSaludos = miview?.findViewById(R.id.cardSaludos)

        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)

        btnSaludos?.setOnClickListener{
            URL = "https://drive.google.com/file/d/1oqdMWr4pK-1ZWjHrJz7xWItJQ5Hi7qiC/view?usp=sharing"
            val toast = Toast.makeText(this.context ,"Funciona el boton", Toast.LENGTH_SHORT).show()
            setCurrentFragment(URL)
        }



    }

    private fun setCurrentFragment(url: String) {

        val bundle = Bundle()
        bundle.putString("key", url)
        val fragment = videosView()
        fragment.arguments = bundle

        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.nav_host_fragment_activity_main, fragment)
        fr?.addToBackStack(null)
        fr?.commit()
    }

}