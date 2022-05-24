package com.example.lsm_app.ui.lecciones

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LeccionesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Este es el fragmento de lecciones"
    }
    val text: LiveData<String> = _text
}