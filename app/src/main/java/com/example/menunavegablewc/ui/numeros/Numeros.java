package com.example.menunavegablewc.ui.numeros;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.menunavegablewc.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Numeros#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Numeros extends Fragment {
    private EditText nro;
    private Button bt;
    private NumerosViewModel vm;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Numeros() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Numeros.
     */
    // TODO: Rename and change types and number of parameters
    public static Numeros newInstance(String param1, String param2) {
        Numeros fragment = new Numeros();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        vm = new NumerosViewModel();
        vm.getNumero().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                nro.setText(s);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_numeros, container, false);
        nro = view.findViewById(R.id.etNro);
        bt = view.findViewById(R.id.btEnviar);
        vm.setNumero(nro.getText().toString());

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("numero",nro.getText().toString());
                Navigation.findNavController(v).navigate(R.id.detalleNumeros, bundle);
            }
        });

        return view;
    }
}
