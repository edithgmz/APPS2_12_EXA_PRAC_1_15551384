package com.example.tabulador;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity{
    Button btn1, btn2, btn3;
    Uno uno;
    Dos dos;
    Tres tres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        uno = new Uno();
        dos = new Dos();
        tres = new Tres();


        getSupportFragmentManager().beginTransaction().add(R.id.relative, uno).commit();
    }

    public void onClick(View view) {
        FragmentTransaction fmTrans = getSupportFragmentManager().beginTransaction();
        Toast.makeText(this, "toy picando un boton", Toast.LENGTH_SHORT).show();
        switch (view.getId()){
            case R.id.button:
                Toast.makeText(this, "bton 1", Toast.LENGTH_SHORT).show();
                fmTrans.replace(R.id.relative, uno).commit();
                break;
            case R.id.button2:
                fmTrans.replace(R.id.relative, dos).commit();
                break;
            case R.id.button3:
                fmTrans.replace(R.id.relative, tres).commit();
                break;
        }
    }

}
