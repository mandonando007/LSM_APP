package com.example.lsm_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class nav_glosario : Fragment() {

    var misLetras : TextView? = null
    var miVista : View? = null
    var carLetra : String? = "Letraa"
    var letraSel : String? =  ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_nav_glosario, container, false)

        miVista = view

        misLetras = miVista?.findViewById(R.id.lblLetras)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     //   btnA.setOnClickListener(){
           // letraSel = "A"

         //   setCurrentFragment(letraSel!!)

       // } //Del listener botón A


        //btnB.setOnClickListener(){
          //  letraSel = "B"

            //Le pasamos los datos al fragmento
            //val bundle = Bundle()
            ///bundle.putString("carLetra", letraSel )
            //var frag = nav_letras()

            ///frag.arguments = bundle

            //Cuando el usuario de click en este botón, este fragmento debe reemplazarse con el nuevo
            //fragmento, que es el de la ubicación del Plantel

            //var fr = getFragmentManager()?.beginTransaction()

//            fr?.replace(R.id.container, frag)

  //          fr?.addToBackStack(null)

    //     fr?.commit()


        } //Del listener botón B

      //  btnC.setOnClickListener {
        //    letraSel = "C"

            //Le pasamos los datos al fragmento
          //  val bundle = Bundle()
            //bundle.putString("carLetra", letraSel )
            //var frag = nav_letras()

            //frag.arguments = bundle

            //Cuando el usuario de click en este botón, este fragmento debe reemplazarse con el nuevo
            //fragmento, que es el de la ubicación del Plantel

//            var fr = getFragmentManager()?.beginTransaction()

  //          fr?.replace(R.id.container, frag)

    //        fr?.addToBackStack(null)

        //    fr?.commit()
      //  }

    //}//-------------------------------------- Termina el OnViewCreated
    private fun setCurrentFragment(ltrSelec : String  ){

        //Le pasamos los datos al fragmento
        val bundle = Bundle()
        bundle.putString("carLetra", ltrSelec )
        var frag = nav_letras()

        frag.arguments = bundle


        var fr = getFragmentManager()?.beginTransaction()

        fr?.replace(R.id.container, frag)

        fr?.addToBackStack(null)

        fr?.commit()
    }
}