package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BatNavActivity extends AppCompatActivity {

    private int i[][], n1[][];   //creo le matrici Io e Nemico (g1, g2)
    private TextView lblTit, io, nem;
    private boolean g1;
    Button b00;
    Button b[][];
    Button n[][];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bat_nav);

        bindComponent();

        lblTit = findViewById(R.id.lblTit);
        Intent intent;
        intent = getIntent();
        //lblTit.setText(intent.getStringExtra("g1")+ "VS" + intent.getStringExtra("g2"));

        g1=true;

        b00.setOnClickListener(new myListener());

        //giocatore 1 I (Io)
        i = new int[6][6];
        for(int k=0; k<6; k++){
            for(int j=0; j<6; j++){
                i[k][j]=0;
            }
        }
        for(int k=0; k<3; k++){
            for(int j=0; j<3; j++){
                //b[k][j].setOnClickListener(new myListener());
            }
        }

        //giocatore 2 N (nemico)
        n1 = new int[6][6];
        for(int k=0; k<6; k++){
            for(int j=0; j<6; j++){
                n1[k][j]=0;
            }
        }
        for(int k=0; k<3; k++){
            for(int j=0; j<3; j++){
                //n[k][j].setOnClickListener(new hisListener());
            }
        }
    }

    private void bindComponent(){
        lblTit = findViewById(R.id.lblTit);
        io = findViewById(R.id.lblIo);

        b00 = findViewById(R.id.btn00);

        b = new Button[6][6];
        b[0][0]= findViewById(R.id.btn00);
        b[0][0].setTransitionName("btn_0_0");
        b[0][1]= findViewById(R.id.btn01); //b[0][1].setTransitionName("btn_0_1");
        b[0][2]= findViewById(R.id.btn02); //b[0][2].setTransitionName("btn_0_2");
        b[0][3]= findViewById(R.id.btn03); //b[1][0].setTransitionName("btn_1_0");
        b[0][4]= findViewById(R.id.btn04); //b[1][1].setTransitionName("btn_1_1");
        b[0][5]= findViewById(R.id.btn05); //b[1][2].setTransitionName("btn_1_2");
        b[1][0]= findViewById(R.id.btn10); //b[2][0].setTransitionName("btn_2_0");
        b[1][1]= findViewById(R.id.btn11); //b[2][1].setTransitionName("btn_2_1");
        b[1][2]= findViewById(R.id.btn12); //b[2][2].setTransitionName("btn_2_2");
        b[1][3]= findViewById(R.id.btn13); //b[0][0].setTransitionName("btn_0_0");
        b[1][4]= findViewById(R.id.btn14); //b[0][1].setTransitionName("btn_0_1");
        b[1][5]= findViewById(R.id.btn15); //b[0][2].setTransitionName("btn_0_2");
        b[2][0]= findViewById(R.id.btn20); //b[1][0].setTransitionName("btn_1_0");
        b[2][1]= findViewById(R.id.btn21); //b[1][1].setTransitionName("btn_1_1");
        b[2][2]= findViewById(R.id.btn22); //b[1][2].setTransitionName("btn_1_2");
        b[2][3]= findViewById(R.id.btn23); //b[2][0].setTransitionName("btn_2_0");
        b[2][4]= findViewById(R.id.btn24); //b[2][1].setTransitionName("btn_2_1");
        b[2][5]= findViewById(R.id.btn25); //b[2][2].setTransitionName("btn_2_2");
        b[3][0]= findViewById(R.id.btn30); //b[0][0].setTransitionName("btn_0_0");
        b[3][1]= findViewById(R.id.btn31); //b[0][1].setTransitionName("btn_0_1");
        b[3][2]= findViewById(R.id.btn32); //b[0][2].setTransitionName("btn_0_2");
        b[3][3]= findViewById(R.id.btn33); //b[1][0].setTransitionName("btn_1_0");
        b[3][4]= findViewById(R.id.btn34); //b[1][1].setTransitionName("btn_1_1");
        b[3][5]= findViewById(R.id.btn35); //b[1][2].setTransitionName("btn_1_2");
        b[4][0]= findViewById(R.id.btn40); //b[2][0].setTransitionName("btn_2_0");
        b[4][1]= findViewById(R.id.btn41); //b[2][1].setTransitionName("btn_2_1");
        b[4][2]= findViewById(R.id.btn42); //b[2][2].setTransitionName("btn_2_2");
        b[4][3]= findViewById(R.id.btn43); //b[0][1].setTransitionName("btn_0_1");
        b[4][4]= findViewById(R.id.btn44); //b[0][2].setTransitionName("btn_0_2");
        b[4][5]= findViewById(R.id.btn45); //b[1][0].setTransitionName("btn_1_0");
        b[5][0]= findViewById(R.id.btn50); //b[1][1].setTransitionName("btn_1_1");
        b[5][1]= findViewById(R.id.btn51); //b[1][2].setTransitionName("btn_1_2");
        b[5][2]= findViewById(R.id.btnbtn52); //b[2][0].setTransitionName("btn_2_0");
        b[5][3]= findViewById(R.id.btn53); //b[2][1].setTransitionName("btn_2_1");
        b[5][4]= findViewById(R.id.btn54); //b[2][2].setTransitionName("btn_2_2");
        b[5][5]= findViewById(R.id.btn55); //b[2][2].setTransitionName("btn_2_2");

        n = new Button[6][6];
        n[0][0]= findViewById(R.id.btn00); //b[0][0].setTransitionName("btn_0_0");
        n[0][1]= findViewById(R.id.btn01); //b[0][1].setTransitionName("btn_0_1");
        n[0][2]= findViewById(R.id.btn02); //b[0][2].setTransitionName("btn_0_2");
        n[0][3]= findViewById(R.id.btn10); //b[1][0].setTransitionName("btn_1_0");
        n[0][4]= findViewById(R.id.btn11); //b[1][1].setTransitionName("btn_1_1");
        n[0][5]= findViewById(R.id.btn12); //b[1][2].setTransitionName("btn_1_2");
        n[1][0]= findViewById(R.id.btn20); //b[2][0].setTransitionName("btn_2_0");
        n[1][1]= findViewById(R.id.btn21); //b[2][1].setTransitionName("btn_2_1");
        n[1][2]= findViewById(R.id.btn22); //b[2][2].setTransitionName("btn_2_2");
        n[1][3]= findViewById(R.id.btn00); //b[0][0].setTransitionName("btn_0_0");
        n[1][4]= findViewById(R.id.btn01); //b[0][1].setTransitionName("btn_0_1");
        n[1][5]= findViewById(R.id.btn02); //b[0][2].setTransitionName("btn_0_2");
        n[2][0]= findViewById(R.id.btn10); //b[1][0].setTransitionName("btn_1_0");
        n[2][1]= findViewById(R.id.btn11); //b[1][1].setTransitionName("btn_1_1");
        n[2][2]= findViewById(R.id.btn12); //b[1][2].setTransitionName("btn_1_2");
        n[2][3]= findViewById(R.id.btn20); //b[2][0].setTransitionName("btn_2_0");
        n[2][4]= findViewById(R.id.btn21); //b[2][1].setTransitionName("btn_2_1");
        n[2][5]= findViewById(R.id.btn22); //b[2][2].setTransitionName("btn_2_2");
        n[3][0]= findViewById(R.id.btn00); //b[0][0].setTransitionName("btn_0_0");
        n[3][1]= findViewById(R.id.btn01); //b[0][1].setTransitionName("btn_0_1");
        n[3][2]= findViewById(R.id.btn02); //b[0][2].setTransitionName("btn_0_2");
        n[3][3]= findViewById(R.id.btn10); //b[1][0].setTransitionName("btn_1_0");
        n[3][4]= findViewById(R.id.btn11); //b[1][1].setTransitionName("btn_1_1");
        n[3][5]= findViewById(R.id.btn12); //b[1][2].setTransitionName("btn_1_2");
        n[4][0]= findViewById(R.id.btn20); //b[2][0].setTransitionName("btn_2_0");
        n[4][1]= findViewById(R.id.btn21); //b[2][1].setTransitionName("btn_2_1");
        n[4][2]= findViewById(R.id.btn22); //b[2][2].setTransitionName("btn_2_2");
        n[4][3]= findViewById(R.id.btn01); //b[0][1].setTransitionName("btn_0_1");
        n[4][4]= findViewById(R.id.btn02); //b[0][2].setTransitionName("btn_0_2");
        n[4][5]= findViewById(R.id.btn10); //b[1][0].setTransitionName("btn_1_0");
        n[5][0]= findViewById(R.id.btn11); //b[1][1].setTransitionName("btn_1_1");
        n[5][1]= findViewById(R.id.btn12); //b[1][2].setTransitionName("btn_1_2");
        n[5][2]= findViewById(R.id.btn20); //b[2][0].setTransitionName("btn_2_0");
        n[5][3]= findViewById(R.id.btn21); //b[2][1].setTransitionName("btn_2_1");
        n[5][4]= findViewById(R.id.btn22); //b[2][2].setTransitionName("btn_2_2");
        n[5][5]= findViewById(R.id.btn22); //b[2][2].setTransitionName("btn_2_2");

    }

    class myListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            boolean vittoria;
            int x,y;
            // 1. rintracciare pulsante chiamante
            Button bL = (Button) v;
            //2. assegno a x y le coordinate lette dal Button
            x= Integer.parseInt(bL.getTransitionName().split("_")[1]);
            y= Integer.parseInt(bL.getTransitionName().split("_")[2]);


            
        }

        /*@Override
        public void onClick(View v) {
            boolean vittoria;
            int x,y;
            // 1. rintracciare pulsante chiamante
            Button bL = (Button) v;
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


            if(vittoria){
                if (!g1) {      //ATTENZIONE, G1 (DOPO IL CLICK) DIVENTA FALSE
                    vince("Vince giocatore 1");
                }else {
                    vince("Vince giocatore 2");
                }
                bloccaPulsanti();
            }
        }*/
    }
}
