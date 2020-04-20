package com.example.menunavegablewc.ui.palabras;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class PalabrasViewModel extends ViewModel {

    private MutableLiveData<List<String>> listaDePalabras;


    public LiveData<List<String>> getListaDePalabras() {
        if(listaDePalabras==null){
            listaDePalabras=new MutableLiveData<>();
        }
        return listaDePalabras;
    }

    public void cargarDatos(){

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Gaston");
        lista.add("Gabriela");
        lista.add("Thiago");

        listaDePalabras.setValue(lista);

    }
}
