package com.example.menunavegablewc.ui.numeros;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DetalleNumerosViewModel extends ViewModel {
    private MutableLiveData<String> respuesta;

    public LiveData<String> getRespuesta() {
        if(respuesta==null){
            respuesta=new MutableLiveData<>();
        }
        return respuesta;
    }

    public void setRespuesta(String res){
        double valor = Double.parseDouble(res);
        if (valor%2 == 0){
            respuesta.setValue("Si");
        } else {
            respuesta.setValue("No");
        }
    }
}
