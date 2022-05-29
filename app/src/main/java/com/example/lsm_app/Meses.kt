
package com.example.lsm_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Meses : Fragment(R.layout.meses) {

    private var letraSel : String? =  ""

    var miview: View? = null
    var btnEnero: CardView? = null
    var btnFebrero: CardView? = null
    var btnMarzo: CardView? = null
    var btnAbril: CardView? = null
    var btnMayo: CardView? = null
    var btnJunio: CardView? = null
    var btnJulio: CardView? = null
    var btnAgosto: CardView? = null
    var btnSeptiembre: CardView? = null
    var btnOctubre: CardView? = null
    var btnNoviembre: CardView? = null
    var btnDiciembre: CardView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.meses, container, false)
        miview = vista

        btnEnero = miview?.findViewById(R.id.enero)
        btnFebrero = miview?.findViewById(R.id.febrero)
        btnMarzo = miview?.findViewById(R.id.marzo)
        btnAbril= miview?.findViewById(R.id.abril)
        btnMayo = miview?.findViewById(R.id.mayo)
        btnJunio = miview?.findViewById(R.id.junio)
        btnJulio = miview?.findViewById(R.id.julio)
        btnAgosto= miview?.findViewById(R.id.agosto)
        btnSeptiembre = miview?.findViewById(R.id.septiembre)
        btnOctubre = miview?.findViewById(R.id.octubre)
        btnNoviembre = miview?.findViewById(R.id.noviembre)
        btnDiciembre = miview?.findViewById(R.id.diciembre)


        return  vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letraSel = "Coco"
        btnEnero?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnFebrero?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnMarzo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAbril?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnMayo?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnJunio?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnJulio?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnAgosto?.setOnClickListener {
        setCurrentFragment(letraSel!!)
        }
        btnSeptiembre?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }

        btnOctubre?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnNoviembre?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
        btnDiciembre?.setOnClickListener {
            setCurrentFragment(letraSel!!)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    private fun setCurrentFragment(ltrSelec : String  ){
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