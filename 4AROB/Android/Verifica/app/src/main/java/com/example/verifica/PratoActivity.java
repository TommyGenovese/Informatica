package com.example.verifica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Random;
import java.util.Vector;

public class PratoActivity extends AppCompatActivity {
    private static final String TAG = "PratoActivity";
    private final int RIG = 9;
    private final int COL = 9;
    private final int NBOMBE = 9;
    private int pulCliccati = 0;
    private int gioc = 1;
    private TextView testo;

    //dichiaro le 9 righe dell'activity
    TableRow t0, t1, t2, t3, t4, t5, t6, t7, t8;
    int mat[][];
    Button btn[][];
    //dichiaro un vettore di bottoni
    Vector<Button> vecBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prato);
        Log.e(TAG, "Avviazione activity");


        //inizializzo la matrice in modo dinamico
        int rand;
        mat=new int[RIG][COL];
        for(int r=0; r<RIG; r++){
            //metto una bomba per ogni riga in modo casuale
            Random ran = new Random();
            rand = ran.nextInt(9);
            for(int c=0; c<COL; c++){
                mat[r][c]= 0;
            }
            //bomba -1
            mat[r][rand] = -1;
        }
        binding();

        //imposto la scritta
        Intent intent;
        intent = getIntent();
        testo.setText("Benvenuto" + intent.getStringExtra("giocatore"));

    }

    private void binding(){
        btn = new Button[RIG][COL];
        vecBtn = new Vector<Button>();
        Button btn;
        testo = findViewById(R.id.textNome);

        //Do il nome ai pulsanti delle varie righe
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            //le grandezze dei bottoni non so se sono corrette dato che non riesco ad avviare l'applicazione
            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            //do il nome ai pulsanti incrementando solamente la i (btn[0][0], btn[0][1], btn[0][2]...)
            btn.setTransitionName("btn_0_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t0.addView(btn);
        }
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            //le grandezze dei bottoni non so se sono corrette dato che non riesco ad avviare l'applicazione
            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            //do il nome ai pulsanti incrementando solamente la i (btn[0][0], btn[0][1], btn[0][2]...)
            btn.setTransitionName("btn_1_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t1.addView(btn);
        }
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            btn.setTransitionName("btn_2_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t2.addView(btn);
        }
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            btn.setTransitionName("btn_3_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t3.addView(btn);
        }
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            btn.setTransitionName("btn_4_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t4.addView(btn);
        }
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            btn.setTransitionName("btn_5_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t5.addView(btn);
        }
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            btn.setTransitionName("btn_6_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t6.addView(btn);
        }
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            btn.setTransitionName("btn_7_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t7.addView(btn);
        }
        for(int i=0; i<COL; i++){
            btn = new Button(this);

            btn.setLayoutParams(new ViewGroup.LayoutParams(17, 17));

            btn.setTransitionName("btn_8_"+i);
            btn.setOnClickListener(new myListener());
            vecBtn = new Vector<Button>();
            t8.addView(btn);
        }

        t0 = findViewById(R.id.t0);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
    }

    //creo un listener in comune per tutti i bottoni (evitando di farne 81)
    class myListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            pulCliccati++;
            //dichiaro x e y che ricavo dal nome del tasto tramite la split che, quando trova il simbolo "_" prende il valore successivo
            int x, y;
            x= Integer.parseInt(btn.getTransitionName().split("_")[1]);
            y= Integer.parseInt(btn.getTransitionName().split("_")[2]);
            //Ho trovato le coordinate del tasto cliccato
            controllaTasto(x,y);

        }

        @SuppressLint("ResourceAsColor")
        void controllaTasto(int x, int y){
            if(mat[x][y] == -1){
                perso();
            }else{
                numeroBombe(x,y);
            }
            btn[x][y].setEnabled(false);
            if(pulCliccati-NBOMBE == 72){
                bloccaPulsanti();
                testo.setText("Hai vinto🙂, complimenti!!!");
                testo.setTextColor(R.color.colorRed);
            }
        }

        @SuppressLint("ResourceAsColor")
        void perso(){
            //disabilito tutti i pulsanti
            bloccaPulsanti();
            testo.setText("Hai perso! 😭");
            testo.setTextColor(R.color.colorRed);
        }

        void bloccaPulsanti(){
            for(int r=0; r<RIG;r++){
                for(int c=0; c<COL; c++){
                    btn[r][c].setEnabled(false);
                }
            }
        }

        void numeroBombe(int x, int y){
            int bombe=0;
            if(mat[x-1][y-1] == -1){
                bombe++;
            }if(mat[x][y-1] == -1){
                bombe++;
            }if(mat[x+1][y-1] == -1){
                bombe++;
            }if(mat[x+1][y] == -1){
                bombe++;
            }if(mat[x+1][y+1] == -1){
                bombe++;
            }if(mat[x][y+1] == -1){
                bombe++;
            }if(mat[x-1][y+1] == -1){
                bombe++;
            }if(mat[x-1][y] == -1){
                bombe++;
            }
            //stampo il numero di bombe vicino al tasto selezionato
            btn[x][y].setText(bombe);
        }
    }

}
