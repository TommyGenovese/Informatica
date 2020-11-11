package com.example.prova;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TrisActivity extends AppCompatActivity {
    private static final String TAG= "TrisActivity";

    private int m[][];
    private boolean g1;

    private TextView lblTit;
    private TextView txtTurniTris;
    //possibilità 1
    Button b00, b01, b02;
    Button b10, b11, b12;
    Button b20, b21, b22;
    private Button btnPlay;

    //possibilità 2
    Button b[][];



    /*private Button btn00, btn01, btn02;
    private Button btn10, btn11, btn12;
    private Button btn20, btn21, btn22;
    private Button btnPlay;
    private TextView txtTurniTris;
    private int num = 1;
    private boolean win = false;*/

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
        //init giocatore
        g1=true;
        //init matrice
        m= new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                m[i][j]=0;
            }
        }
        //poss 1
        /*b00.setOnClickListener(new myListener());
        b01.setOnClickListener(new myListener());
        b02.setOnClickListener(new myListener());
        b10.setOnClickListener(new myListener());
        b11.setOnClickListener(new myListener());
        b12.setOnClickListener(new myListener());
        b20.setOnClickListener(new myListener());
        b21.setOnClickListener(new myListener());
        b22.setOnClickListener(new myListener());*/

        //possibilità 2
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j].setOnClickListener(new myListener());
            }
        }
    }

    private void bindComponent(){
        lblTit = findViewById(R.id.lblTit);
        txtTurniTris = findViewById(R.id.txtTurniTris);
        btnPlay = findViewById(R.id.btnPlay);

        //possibilità 1
        /*b00 = findViewById(R.id.btn00);
        b01 = findViewById(R.id.btn01);
        b02 = findViewById(R.id.btn02);
        b10 = findViewById(R.id.btn10);
        b11 = findViewById(R.id.btn11);
        b12 = findViewById(R.id.btn12);
        b20 = findViewById(R.id.btn20);
        b21 = findViewById(R.id.btn21);
        b22 = findViewById(R.id.btn22);*/

        //possibilità 2
        b = new Button[3][3];
        b[0][0]= findViewById(R.id.btn00); //b[0][0].setTransitionName("btn_0_0");
        b[0][1]= findViewById(R.id.btn01); //b[0][1].setTransitionName("btn_0_1");
        b[0][2]= findViewById(R.id.btn02); //b[0][2].setTransitionName("btn_0_2");
        b[1][0]= findViewById(R.id.btn10); //b[1][0].setTransitionName("btn_1_0");
        b[1][1]= findViewById(R.id.btn11); //b[1][1].setTransitionName("btn_1_1");
        b[1][2]= findViewById(R.id.btn12); //b[1][2].setTransitionName("btn_1_2");
        b[2][0]= findViewById(R.id.btn20); //b[2][0].setTransitionName("btn_2_0");
        b[2][1]= findViewById(R.id.btn21); //b[2][1].setTransitionName("btn_2_1");
        b[2][2]= findViewById(R.id.btn22); //b[2][2].setTransitionName("btn_2_2");

    }

    private void setupEventListener(){
        btnPlay.setOnClickListener(new View.OnClickListener() {

            boolean res = false;
            public void onClick(View v) {
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        b[i][j].setEnabled(true);
                    }
                }
                txtTurniTris.setBackgroundResource(R.color.colorLRed);
                txtTurniTris.setText(getIntent().getStringExtra("g1"));
                btnPlay.setText("Reset");
                if(res==true){
                    //reset del gioco (è uguale all'onCreate)
                    /*lblTit = findViewById(R.id.lblTit);
                    Intent intent;
                    intent = getIntent();
                    lblTit.setText(intent.getStringExtra("g1")+ " VS "+ intent.getStringExtra("g2"));
                    //init giocatore
                    g1=true;
                    //init matrice
                    m= new int[3][3];
                    for(int i=0; i<3; i++){
                        for(int j=0; j<3; j++){
                            m[i][j]=0;
                        }
                    }
                    for(int i=0; i<3; i++){
                        for(int j=0; j<3; j++){
                            b[i][j].setOnClickListener(new myListener());
                        }
                    }*/
                    Intent intent =  new Intent(TrisActivity.this, TrisActivity.class);
                    intent.putExtra("g1", "Giocatore 1");
                    intent.putExtra("g2", "Giocatore 2");
                    startActivity(intent);
                    res=false;
                }
                res = true;
            }
        });
    }

    void reset(){

        //init giocatore
        g1=true;
        //init matrice
        m= new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                m[i][j]=0;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j].setOnClickListener(new myListener());
            }
        }
    }

    void vince(String g){
        Toast.makeText(this, g, Toast.LENGTH_LONG).show();
    }

    void bloccaPulsanti(){
        //Possibilità 1
        /*b00.setEnabled(false);
        b01.setEnabled(false);
        b02.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b20.setEnabled(false);
        b21.setEnabled(false);
        b22.setEnabled(false);*/

        //possibilità 2
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j].setEnabled(false);
            }
        }
    }
    class myListener implements View.OnClickListener{
        private static final String TAG= "ClassListener";

        @Override
        public void onClick(View v) {
            boolean vittoria;
            int x,y;
            // 1. rintracciare pulsante chiamante
            Button bL = (Button) v;
            Log.i(TAG, String.valueOf(bL.getId()));
            //2. assegno a x y le coordinate lette dal Button
            x= Integer.parseInt(bL.getTransitionName().split("_")[1]);
            y= Integer.parseInt(bL.getTransitionName().split("_")[2]);

            if(g1){
                m[x][y]=1;
                g1= false;
                bL.setBackgroundResource(R.color.colorLRed);
            }else{
                m[x][y]=2;
                g1 = true;
                bL.setBackgroundResource(R.color.colorLBlue);
            }
            bL.setEnabled(false); //disabilitiamo il click del pulsante

            vittoria = false;
            //controllo vittoria

            //VERTICALE
            if(m[0][y] == m[x][y] && m[1][y]==m[x][y] && m[2][y]==m[x][y]){
                //vittoria verticale
                vittoria = true;
            }else{
                //ORIZZONTALE
                if(m[x][0] == m[x][y] && m[x][1] == m[x][y] && m[x][2] == m[x][y]){
                    vittoria = true;
                }else{
                    //DIAGONALE principale
                    if(m[0][0]== m[x][y] && m[1][1]== m[x][y] && m[2][2]== m[x][y]){
                        vittoria = true;
                    }else if(m[2][0]== m[x][y] && m[1][1]== m[x][y] && m[0][2]== m[x][y]){
                        //diagonale secondaria
                        vittoria = true;
                    }
                }
            }
            if(vittoria){
                if (!g1) {      //ATTENZIONE, G1 (DOPO IL CLICK) DIVENTA FALSE
                    Log.d(TAG, "Vince giocatore 1");
                    vince("Vince giocatore 1");
                }else {
                    Log.d(TAG, "Vince giocatore 2");
                    vince("Vince giocatore 2");
                }
                bloccaPulsanti();
            }
        }
    }

    /*
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn00.setEnabled(false);
                }
                if(num==10 && win==false){
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn01.setEnabled(false);
                }
                if(num==10 && win==false){
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn02.setEnabled(false);
                }
                if(num==10 && win==false){
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn10.setEnabled(false);
                }
                if(num==10 && win==false){
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn11.setEnabled(false);
                }
                if(num==10 && win==false){
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn12.setEnabled(false);
                }
                if(num==10 && win==false){
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn20.setEnabled(false);
                }
                if(num==10 && win==false){
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn21.setEnabled(false);
                }
                if(num==10 && win==false){
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
                        win=true;
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
                        win=true;
                    }else {
                        txtTurniTris.setBackgroundResource(R.color.colorLBlue);
                        txtTurniTris.setText(getIntent().getStringExtra("g2"));
                    }
                    btn22.setEnabled(false);
                }
                if(num==10 && win==false) {
                    txtTurniTris.setBackgroundResource(R.color.colorLYel);
                    txtTurniTris.setText("Pareggio!");
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
    }*/
}
