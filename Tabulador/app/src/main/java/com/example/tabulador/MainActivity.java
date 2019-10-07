package com.example.tabulador;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity{
    Button btn1, btn2, btn3;
    UnoFragment unoFragment;
    DosFragment dosFragment;
    TresFragment tresFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        unoFragment = new UnoFragment();
        dosFragment = new DosFragment();
        tresFragment = new TresFragment();


        getSupportFragmentManager().beginTransaction().add(R.id.rlFrags, unoFragment).commit();
    }

    public void onClick(View view) {
        FragmentTransaction fmTrans = getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.btn1:
                fmTrans.replace(R.id.rlFrags, unoFragment).commit();
                break;
            case R.id.btn2:
                fmTrans.replace(R.id.rlFrags, dosFragment).commit();
                break;
            case R.id.btn3:
                fmTrans.replace(R.id.rlFrags, tresFragment).commit();
                break;
        }
    }
}
