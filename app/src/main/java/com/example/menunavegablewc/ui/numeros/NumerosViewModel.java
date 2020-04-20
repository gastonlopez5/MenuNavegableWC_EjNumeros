package com.example.menunavegablewc.ui.numeros;

import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NumerosViewModel extends ViewModel {
    private MutableLiveData<String> numero;

    public NumerosViewModel() {
        numero = new MutableLiveData<>();
    }

    public LiveData<String> getNumero(){
        return numero;
    }

    public void setNumero(String valor) {
        numero.setValue(valor);
    }
}
