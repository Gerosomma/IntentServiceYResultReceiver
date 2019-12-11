package com.somma.intentserviceyresultreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MENSAJE = "EXTRA_MENSAJE";
    protected TextView tvMensaje;
    private String mensajePredeterminado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMensaje = (TextView)findViewById(R.id.tvMensaje);
        mensajePredeterminado = getResources().getString(R.string.tvMensaje);
    }

    public void btnRestaurarOnClick(View view) {

    }

    public void btnProcesarOnClick(View view) {

    }
}
