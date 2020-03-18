package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.NumberPicker;

public class AltoBassoActivity extends AppCompatActivity {
    private Number numIns;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altobasso);

        bindComponent();
        setupEventListener();
    }

    @SuppressLint("WrongViewCast")
    private void bindComponent(){
        //numIns = findViewById(R.id.numbInsert);


    }

    private void setupEventListener(){
        //numIns.
    }
}
