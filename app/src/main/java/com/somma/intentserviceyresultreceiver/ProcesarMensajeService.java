package com.somma.intentserviceyresultreceiver;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

import androidx.annotation.Nullable;

public class ProcesarMensajeService extends IntentService {

    public static final String MIS_LOGS = "MIS_LOGS";

    public ProcesarMensajeService() {
        super(ProcesarMensajeService.class.getSimpleName());
    }

    public ProcesarMensajeService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(MIS_LOGS, "onHandleIntent corre en el hilo " + Thread.currentThread().getId());

        String mensaje = intent.getStringExtra(MainActivity.EXTRA_MENSAJE);
        StringBuilder mensajeProcesado = new StringBuilder();

        for (int i = mensaje.length() -1; i >= 0; i--) {
            SystemClock.sleep(500);

            mensajeProcesado.append(mensaje.charAt(i));
        }
    }
}
