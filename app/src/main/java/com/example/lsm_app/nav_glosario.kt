package com.example.lsm_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class nav_glosario : Fragment() {
    var miVista : View? = null
    private var letraSel : String? =  ""
    var btn: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_nav_glosario, container, false)

        miVista = view
        btn = view?.findViewById(R.id.btnA)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn?.setOnClickListener {
            letraSel = "A"
            setCurrentFragment(letraSel!!)
        } // Del boton A


    }


    private fun setCurrentFragment(ltrSelec : String  ){

        //Le pasamos los datos al fragmento
        val bundle = Bundle()
        bundle.putString("carLetra", ltrSelec )
        var frag = nav_letras()

        frag.arguments = bundle

        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.nav_host_fragment_activity_main, frag)
        fr?.addToBackStack(null)
        fr?.commit()
    }

}