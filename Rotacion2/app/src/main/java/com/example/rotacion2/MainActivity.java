package com.example.rotacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();

        if (d.getRotation() == Surface.ROTATION_90){

        }else {

        }
    }
}
