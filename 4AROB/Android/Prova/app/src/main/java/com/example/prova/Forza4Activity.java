package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;

import org.w3c.dom.Text;

public class Forza4Activity extends AppCompatActivity {
    private static final String TAG= "Forza4Activity";
    public int m[][];   //integer matrix
    Button b[][];   //button matrix
    private boolean g1;
    private Text lblTit;

    TableRow tb[];

    Button btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forza4);

        binding();
        //inizializzazione matrice
        m = new int[6][7];
        for(int r=0; r<6; r++){
            for(int c=0; c<7; c++){
                m[r][c] = 0;
            }
        }

        /*
        tb0 = findViewById(R.id.tbR0);
        tb1 = findViewById(R.id.tbR1);
        tb2 = findViewById(R.id.tbR2);
        tb3 = findViewById(R.id.tbR3);
        tb4 = findViewById(R.id.tbR4);
        tb5 = findViewById(R.id.tbR5);
        Button btn;
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_0_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb0.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_1_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb1.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_2_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb2.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_3_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb3.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_4_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb4.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_5_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb5.addView(btn);
        }
        */
        lblTit = findViewById(R.id.testTit);
        Intent intent;
        intent = getIntent();
        lblTit.setTextContent(intent.getStringExtra("g1")+ " VS "+ intent.getStringExtra("g2"));



        for(int i=0; i<6; i++){
            for(int k=0; k<7; k++){
                btn = new Button(this);
                btn.setTransitionName("btn_"+ k +"_"+i);
                btn.setBackgroundResource(R.color.colorLYel);
                btn.setOnClickListener(new MyListener());
                tb[k].addView(btn);
            }
        }
    }

    void binding(){
        //binding
        tb[0] = findViewById(R.id.tbRow1);
        tb[1] = findViewById(R.id.tbRow2);
        tb[2] = findViewById(R.id.tbRow3);
        tb[3] = findViewById(R.id.tbRow4);
        tb[4] = findViewById(R.id.tbRow5);
        tb[5] = findViewById(R.id.tbRow6);
    }

    class MyListener implements View.OnClickListener{
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
            bL.setEnabled(false);
        }

    }

    private boolean controlloOrizzontale(int x, int y){
        if((   m[x][y]==m[x+1][y]&& m[x][y]==m[x+2][y]&& m[x][y]==m[x+3][y])
            ||(m[x][y]==m[x-1][y]&& m[x][y]==m[x+1][y]&& m[x][y]==m[x+2][y])
            ||(m[x][y]==m[x-2][y]&& m[x][y]==m[x-1][y]&& m[x][y]==m[x+1][y])
            ||(m[x][y]==m[x-3][y]&& m[x][y]==m[x-2][y]&& m[x][y]==m[x-1][y])
            ||(m[x][y]==m[x-4][y]&& m[x][y]==m[x-3][y]&& m[x][y]==m[x-2][y])){

        }
        return false;
    }

}
