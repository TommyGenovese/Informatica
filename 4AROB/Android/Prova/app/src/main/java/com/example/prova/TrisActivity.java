package com.example.prova;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TrisActivity extends AppCompatActivity {
    private TextView lblTit;
    private Button btn00, btn01, btn02;
    private Button btn10, btn11, btn12;
    private Button btn20, btn21, btn22;
    private Button btnPlay;
    private TextView txtTurniTris;
    private int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tris);

        bindComponent();
        setupEventListener();

        lblTit = findViewById(R.id.lblTit);
        Intent intent;
        intent = getIntent();
        lblTit.setText(intent.getStringExtra("g1")+ " VS "+ intent.getStringExtra("g2"));
    }

    private void setupEventListener() {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn00.setEnabled(true);
                btn01.setEnabled(true);
                btn02.setEnabled(true);
                btn10.setEnabled(true);
                btn11.setEnabled(true);
                btn12.setEnabled(true);
                btn20.setEnabled(true);
                btn21.setEnabled(true);
                btn22.setEnabled(true);
                txtTurniTris.setBackgroundResource(R.color.colorLRed);
                txtTurniTris.setText(getIntent().getStringExtra("g1"));
                btnPlay.setEnabled(false);
            }
        });

        //Bottone 00
        btn00.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"ResourceAsColor", "SetTextI18n"})
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn00.setText("O");
                    btn00.setBackgroundResource(R.color.colorLBlue);

                    //controllo se ha fatto una serie di 3
                    if((btn01.getText().equals("O") && btn02.getText().equals("O"))
                            ||  (btn10.getText().equals("O") && btn20.getText().equals("O"))
                            || (btn11.getText().equals("O") && btn22.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn00.setEnabled(false);
                }else{
                    num++;
                    btn00.setText("X");
                    btn00.setBackgroundResource(R.color.colorLRed);
                    if((btn01.getText().equals("X") && btn02.getText().equals("X")) || (btn10.getText().equals("X") && btn20.getText().equals("X"))
                            || (btn11.getText().equals("X") && btn22.getText().equals("X"))){
                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g1"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));

                    }
                    btn00.setEnabled(false);
                }
            }
        });



        //Bottone 01
        btn01.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn01.setText("O");
                    btn01.setBackgroundResource(R.color.colorLBlue);
                    if((btn00.getText().equals("O") && btn02.getText().equals("O"))
                            ||  (btn11.getText().equals("O") && btn21.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn01.setEnabled(false);
                }else{
                    num++;
                    btn01.setText("X");
                    btn01.setBackgroundResource(R.color.colorLRed);
                    if((btn00.getText().equals("X") && btn02.getText().equals("X")) || (btn11.getText().equals("X") && btn21.getText().equals("X"))){
                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g1"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn01.setEnabled(false);
                }
            }
        });



        //Bottone 02
        btn02.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn02.setText("O");
                    btn02.setBackgroundResource(R.color.colorLBlue);
                    if((btn00.getText().equals("O") && btn01.getText().equals("O"))
                            ||  (btn11.getText().equals("O") && btn20.getText().equals("O"))
                            ||  (btn12.getText().equals("O") && btn22.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn02.setEnabled(false);

                }else{
                    num++;
                    btn02.setText("X");
                    btn02.setBackgroundResource(R.color.colorLRed);
                    if((btn00.getText().equals("X") && btn01.getText().equals("X"))
                            ||  (btn11.getText().equals("X") && btn20.getText().equals("X"))
                            ||  (btn12.getText().equals("X") && btn22.getText().equals("X"))){
                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g1"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn02.setEnabled(false);
                }
            }
        });



        //Bottone 10
        btn10.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn10.setText("O");
                    btn10.setBackgroundResource(R.color.colorLBlue);
                    if((btn00.getText().equals("O") && btn20.getText().equals("O"))
                            ||  (btn11.getText().equals("O") && btn12.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn10.setEnabled(false);
                }else{
                    num++;
                    btn10.setText("X");
                    btn10.setBackgroundResource(R.color.colorLRed);
                    if((btn00.getText().equals("X") && btn20.getText().equals("X"))
                            ||  (btn11.getText().equals("X") && btn12.getText().equals("X"))){
                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g1"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn10.setEnabled(false);
                }
            }
        });



        //Bottone 11
        btn11.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn11.setText("O");
                    btn11.setBackgroundResource(R.color.colorLBlue);
                    if((btn00.getText().equals("O") && btn22.getText().equals("O"))
                            ||  (btn10.getText().equals("O") && btn12.getText().equals("O"))
                            ||  (btn20.getText().equals("O") && btn02.getText().equals("O"))
                            ||  (btn01.getText().equals("O") && btn21.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn11.setEnabled(false);
                }else{
                    num++;
                    btn11.setText("X");
                    btn11.setBackgroundResource(R.color.colorLRed);
                    if((btn00.getText().equals("X") && btn22.getText().equals("X"))
                            ||  (btn10.getText().equals("X") && btn12.getText().equals("X"))
                            ||  (btn20.getText().equals("X") && btn02.getText().equals("X"))
                            ||  (btn01.getText().equals("X") && btn21.getText().equals("X"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn11.setEnabled(false);
                }
            }
        });



        //Bottone 12
        btn12.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn12.setText("O");
                    btn12.setBackgroundResource(R.color.colorLBlue);
                    if((btn02.getText().equals("O") && btn22.getText().equals("O"))
                            ||  (btn10.getText().equals("O") && btn11.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn12.setEnabled(false);
                }else{
                    num++;
                    btn12.setText("X");
                    btn12.setBackgroundResource(R.color.colorLRed);
                    if((btn02.getText().equals("X") && btn22.getText().equals("X"))
                            ||  (btn10.getText().equals("X") && btn11.getText().equals("X"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn12.setEnabled(false);
                }
            }
        });



        //bottone 20
        btn20.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn20.setText("O");
                    btn20.setBackgroundResource(R.color.colorLBlue);
                    if((btn00.getText().equals("O") && btn10.getText().equals("O"))
                            ||  (btn11.getText().equals("O") && btn02.getText().equals("O"))
                            ||  (btn21.getText().equals("O") && btn22.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn20.setEnabled(false);
                }else{
                    num++;
                    btn20.setText("X");
                    btn20.setBackgroundResource(R.color.colorLRed);
                    if((btn00.getText().equals("X") && btn10.getText().equals("X"))
                            ||  (btn11.getText().equals("X") && btn02.getText().equals("X"))
                            ||  (btn21.getText().equals("X") && btn12.getText().equals("X"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn20.setEnabled(false);
                }
            }
        });



        //Bottone 21
        btn21.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn21.setText("O");
                    btn21.setBackgroundResource(R.color.colorLBlue);
                    if((btn01.getText().equals("O") && btn11.getText().equals("O"))
                            ||  (btn20.getText().equals("O") && btn22.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn21.setEnabled(false);
                }else{
                    num++;
                    btn21.setText("X");
                    btn21.setBackgroundResource(R.color.colorLRed);
                    if((btn01.getText().equals("X") && btn11.getText().equals("X"))
                            ||  (btn20.getText().equals("X") && btn22.getText().equals("X"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn21.setEnabled(false);
                }
            }
        });



        //Bottone 22
        btn22.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (num%2==0) {
                    num++;
                    btn22.setText("O");
                    btn22.setBackgroundResource(R.color.colorLBlue);
                    if((btn00.getText().equals("O") && btn11.getText().equals("O"))
                            ||  (btn02.getText().equals("O") && btn12.getText().equals("O"))
                            ||  (btn20.getText().equals("O") && btn21.getText().equals("O"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn22.setEnabled(false);
                }else{
                    num++;
                    btn22.setText("X");
                    btn22.setBackgroundResource(R.color.colorLRed);
                    if((btn02.getText().equals("X") && btn12.getText().equals("X"))
                            ||  (btn00.getText().equals("X") && btn11.getText().equals("X"))
                            ||  (btn20.getText().equals("X") && btn21.getText().equals("X"))){

                        txtTurniTris.setBackgroundResource(R.color.colorGreen);
                        txtTurniTris.setText("Ha vinto "+ getIntent().getStringExtra("g2"));
                        btn01.setEnabled(false);
                        btn02.setEnabled(false);
                        btn10.setEnabled(false);
                        btn11.setEnabled(false);
                        btn12.setEnabled(false);
                        btn20.setEnabled(false);
                        btn21.setEnabled(false);
                        btn22.setEnabled(false);
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLRed);
                        txtTurniTris.setText(getIntent().getStringExtra("g1"));
                    }
                    btn22.setEnabled(false);
                }
            }
        });


    }

    private void bindComponent(){
        txtTurniTris= findViewById(R.id.txtTurniTris);
        btnPlay = findViewById(R.id.btnPlay);
        btn00 = findViewById(R.id.btn00);
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
    }
}
