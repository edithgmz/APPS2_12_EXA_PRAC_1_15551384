package com.example.rotacion2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Texto extends Fragment {
    TextView txtVwtxt;

    public Texto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        txtVwtxt = getActivity().findViewById(R.id.texto);
        //txtVwtxt.setTextSize(TypedValue.COMPLEX_UNIT_PX, 10);
        return inflater.inflate(R.layout.fragment_texto, container, false);
    }

}
