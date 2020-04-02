package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AccActivity extends AppCompatActivity implements SensorEventListener{
    private  static final String TAG = "AccActivity";

    private TextView txtX, txtY, txtZ;
    private Button btnEsci;

    private SensorManager sensorManager;
    private Sensor accelerometro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc);

        //BIND
        txtX = findViewById(R.id.txtX);
        txtY = findViewById(R.id.txtY);
        txtZ = findViewById(R.id.txtZ);
        btnEsci = findViewById(R.id.btnEsciAcc);

        //Listener
        btnEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AccActivity.this.finish();
            }
        });

        //attivazione e collegamento sensore
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE); // init del Gestore dei sensori
        accelerometro = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER); // specifico che l'oggetto sensore andrà a gestire il sensore Accelerometro

        // Registrazione Listener per sensore specifico
        sensorManager.registerListener((SensorEventListener) this, accelerometro, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER){
            Log.d(TAG, "X: "+ event.values[0]+
                    " Y: " + event.values[1]+
                    " Z: "+ event.values[2]);

            txtX.setText((int) event.values[0]);
            txtY.setText((int) event.values[1]);
            txtZ.setText((int) event.values[2]);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}





