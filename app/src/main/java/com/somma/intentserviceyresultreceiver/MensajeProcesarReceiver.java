package com.somma.intentserviceyresultreceiver;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class MensajeProcesarReceiver extends ResultReceiver {

    private MensajeProcesadoListener mensajeProcesadoListener;

    public void setMensajeProcesadoListener(MensajeProcesadoListener mensajeProcesadoListener) {
        this.mensajeProcesadoListener = mensajeProcesadoListener;
    }

    public MensajeProcesarReceiver(Handler gestor) {
        super(gestor);
    }

    @Override
    protected void onReceiveResult(int resultCode, Bundle resultData) {
        if (mensajeProcesadoListener != null) {
            mensajeProcesadoListener.alRecibirResultado(resultCode, resultData);
        }
    }

    public interface MensajeProcesadoListener {
        void alRecibirResultado(int codigoResultado, Bundle datosResultado);
    }
}
