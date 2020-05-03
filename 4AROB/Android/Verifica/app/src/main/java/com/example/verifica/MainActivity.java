package com.example.verifica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtN;
    private String nome;
    private Button btnPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay.setEnabled(false);

        binding();
        setUpEventListener();
    }

    private void binding(){
        btnPlay = findViewById(R.id.btnPlay);
        txtN = findViewById(R.id.txtName);

    }


    private void setUpEventListener(){
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, PratoActivity.class);
                intent.putExtra("giocatore", nome);
                startActivity(intent);
            }
        });
        txtN.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_GO){
                    nome = String.valueOf(txtN.getText());
                    txtN.setText(nome);
                    btnPlay.setEnabled(true);
                }
                return false;
            }
        });
    }
}
