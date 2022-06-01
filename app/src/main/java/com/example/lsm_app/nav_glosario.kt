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
    var btnA: Button? = null
    var btnB: Button? = null
    var btnC: Button? = null
    var btnD: Button? = null
    var btnE: Button? = null
    var btnF: Button? = null
    var btnG: Button? = null
    var btnH: Button? = null
    var btnI: Button? = null
    var btnJ: Button? = null
    var btnK: Button? = null
    var btnL: Button? = null
    var btnLL: Button? = null
    var btnM: Button? = null
    var btnN: Button? = null
    var btnÑ: Button? = null
    var btnO: Button? = null
    var btnP: Button? = null
    var btnQ: Button? = null
    var btnR: Button? = null
    var btnRR: Button? = null
    var btnS: Button? = null
    var btnT: Button? = null
    var btnU: Button? = null
    var btnV: Button? = null
    var btnW: Button? = null
    var btnX: Button? = null
    var btnY: Button? = null
    var btnZ: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_nav_glosario, container, false)

        miVista = view
        btnA = view?.findViewById(R.id.btnA)
        btnB = view?.findViewById(R.id.btnB)
        btnC = view?.findViewById(R.id.btnC)
        btnD = view?.findViewById(R.id.btnD)
        btnE = view?.findViewById(R.id.btnE)
        btnF = view?.findViewById(R.id.btnF)
        btnG = view?.findViewById(R.id.btnG)
        btnH = view?.findViewById(R.id.btnH)
        btnI = view?.findViewById(R.id.btnI)
        btnJ = view?.findViewById(R.id.btnJ)
        btnK = view?.findViewById(R.id.btnK)
        btnL = view?.findViewById(R.id.btnL)
        btnLL = view?.findViewById(R.id.btnLL)
        btnM = view?.findViewById(R.id.btnM)
        btnN = view?.findViewById(R.id.btnN)
        btnÑ = view?.findViewById(R.id.btnÑ)
        btnO = view?.findViewById(R.id.btnO)
        btnP = view?.findViewById(R.id.btnP)
        btnQ = view?.findViewById(R.id.btnQ)
        btnR = view?.findViewById(R.id.btnR)
        btnRR = view?.findViewById(R.id.btnRR)
        btnS = view?.findViewById(R.id.btnS)
        btnT = view?.findViewById(R.id.btnT)
        btnU = view?.findViewById(R.id.btnU)
        btnV = view?.findViewById(R.id.btnV)
        btnW = view?.findViewById(R.id.btnW)
        btnX = view?.findViewById(R.id.btnX)
        btnY = view?.findViewById(R.id.btnY)
        btnZ = view?.findViewById(R.id.btnZ)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnA?.setOnClickListener {
            letraSel = "A"
            setCurrentFragment(letraSel!!)
        } // Del boton A
        btnB?.setOnClickListener {
            letraSel = "B"
            setCurrentFragment(letraSel!!)
        } // Del boton B
        btnC?.setOnClickListener {
            letraSel = "C"
            setCurrentFragment(letraSel!!)
        } // Del boton C
        btnD?.setOnClickListener {
            letraSel = "D"
            setCurrentFragment(letraSel!!)
        } // Del boton D
        btnE?.setOnClickListener {
            letraSel = "E"
            setCurrentFragment(letraSel!!)
        } // Del boton E
        btnF?.setOnClickListener {
            letraSel = "F"
            setCurrentFragment(letraSel!!)
        } // Del boton F
        btnG?.setOnClickListener {
            letraSel = "G"
            setCurrentFragment(letraSel!!)
        } // Del boton G
        btnH?.setOnClickListener {
            letraSel = "H"
            setCurrentFragment(letraSel!!)
        } // Del boton H
        btnI?.setOnClickListener {
            letraSel = "I"
            setCurrentFragment(letraSel!!)
        } // Del boton I
        btnJ?.setOnClickListener {
            letraSel = "J"
            setCurrentFragment(letraSel!!)
        } // Del boton J
        btnK?.setOnClickListener {
            letraSel = "K"
            setCurrentFragment(letraSel!!)
        } // Del boton K
        btnL?.setOnClickListener {
            letraSel = "L"
            setCurrentFragment(letraSel!!)
        } // Del boton L
        btnLL?.setOnClickListener {
            letraSel = "LL"
            setCurrentFragment(letraSel!!)
        } // Del boton LL
        btnM?.setOnClickListener {
            letraSel = "M"
            setCurrentFragment(letraSel!!)
        } // Del boton M
        btnN?.setOnClickListener {
            letraSel = "N"
            setCurrentFragment(letraSel!!)
        } // Del boton N
        btnÑ?.setOnClickListener {
            letraSel = "Ñ"
            setCurrentFragment(letraSel!!)
        } // Del boton Ñ
        btnO?.setOnClickListener {
            letraSel = "O"
            setCurrentFragment(letraSel!!)
        } // Del boton O
        btnP?.setOnClickListener {
            letraSel = "P"
            setCurrentFragment(letraSel!!)
        } // Del boton P
        btnQ?.setOnClickListener {
            letraSel = "Q"
            setCurrentFragment(letraSel!!)
        } // Del boton Q
        btnR?.setOnClickListener {
            letraSel = "R"
            setCurrentFragment(letraSel!!)
        } // Del boton R
        btnRR?.setOnClickListener {
            letraSel = "RR"
            setCurrentFragment(letraSel!!)
        } // Del boton RR
        btnS?.setOnClickListener {
            letraSel = "S"
            setCurrentFragment(letraSel!!)
        } // Del boton S
        btnT?.setOnClickListener {
            letraSel = "T"
            setCurrentFragment(letraSel!!)
        } // Del boton T
        btnU?.setOnClickListener {
            letraSel = "U"
            setCurrentFragment(letraSel!!)
        } // Del boton U
        btnV?.setOnClickListener {
            letraSel = "V"
            setCurrentFragment(letraSel!!)
        } // Del boton V
        btnW?.setOnClickListener {
            letraSel = "W"
            setCurrentFragment(letraSel!!)
        } // Del boton W
        btnX?.setOnClickListener {
            letraSel = "X"
            setCurrentFragment(letraSel!!)
        } // Del boton X
        btnY?.setOnClickListener {
            letraSel = "Y"
            setCurrentFragment(letraSel!!)
        } // Del boton Y
        btnZ?.setOnClickListener {
            letraSel = "Z"
            setCurrentFragment(letraSel!!)
        } // Del boton Z



    }


    private fun setCurrentFragment(ltrSelec : String  ){

        //Le pasamos los datos al fragmento
        val bundle = Bundle()
        bundle.putString("carLetra", ltrSelec )
        var frag = nav_letras()

        frag.arguments = bundle

        var fr = getFragmentManager()?.beginTransaction()
        fr?.add(R.id.fragmentContainerView, frag)
        fr?.addToBackStack(null)
        fr?.commit()
    }

}