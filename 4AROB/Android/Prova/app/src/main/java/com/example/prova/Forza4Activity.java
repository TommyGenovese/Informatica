package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;

public class Forza4Activity extends AppCompatActivity {
    public int m[][];   //integer matrix
    Button b[][];   //button matrix
    public boolean player1 = true;

    TableRow tb[];

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forza4);

        //inizializzazione matrice
        m = new int[6][7];
        for(int r=0; r<6; r++){
            for(int c=0; c<7; c++){
                m[r][c] = 0;
            }
        }

        binding();

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
            int x,y;
            Button btn = (Button) v;
            x = Integer.parseInt(btn.getTransitionName().split("_")[1]);
            y = Integer.parseInt(btn.getTransitionName().split("_")[1]);
        }

        private void inserisciMoneta(int x, int y){

        }
    }

}
