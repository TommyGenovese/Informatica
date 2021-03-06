package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  static final String TAG= "Main Activity";
    private Button btnSal, btnAltoBasso, btnAcc, btnTris, btnForza, btnBatnav;
    private TextView txtS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindComponent();
        setupEventListener();
    }

    private void bindComponent(){
        btnSal = findViewById(R.id.btnSaluta);
        txtS = findViewById(R.id.txtSaluta);
        btnAltoBasso = findViewById(R.id.btnAltoBasso);
        btnTris = findViewById(R.id.btnTris);
        btnForza = findViewById(R.id.btnForza);
        btnBatnav = findViewById(R.id.btnBatnav);
    }

    private void setupEventListener(){
        btnSal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtS.setTextSize(24);
                txtS.setText("Benvenuto sull'applicazione di Tommaso!");
            }
        });

        btnAltoBasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Avvio una nuova activity per giocare ad Alto e Basso
                Intent intent =  new Intent(MainActivity.this, AltoBassoActivity.class);
                intent.putExtra("var", "valore");
                startActivity(intent);
            }
        });

        /*btnAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                //Avvio una nuova activity per visualizzare l'accellerometro
                Intent intent =  new Intent(MainActivity.this, AccActivity.class);
                startActivity(intent);
            }
        });*/

        btnTris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                //Avvio una nuova activity per visualizzare l'accellerometro
                Intent intent =  new Intent(MainActivity.this, TrisActivity.class);
                intent.putExtra("g1", "Giocatore 1");
                intent.putExtra("g2", "Giocatore 2");
                startActivity(intent);
            }
        });



        btnBatnav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BatNavActivity.class);
                intent.putExtra("g1", "giocatore 1");
                intent.putExtra("g1", "giocatore 2");
                startActivity(intent);
            }
        });


        btnForza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrisActivity.class);
                intent.putExtra("g1", "giocatore 1");
                intent.putExtra("g1", "giocatore 2");
                startActivity(intent);
            }
        });


    }
}
