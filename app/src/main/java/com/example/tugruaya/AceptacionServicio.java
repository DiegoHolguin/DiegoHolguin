package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AceptacionServicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptacion_servicio);
    }

    //Se dirige a la vista calificacion
    public void acepServicio(View view){
        Intent miIntent = new Intent(AceptacionServicio.this,Calificacion.class);
        startActivity(miIntent);
    }

    //Vuelve a la vista AceptacionServicio
    public void cancelAceptacionServicio(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.cancelarAceptacionServicio:
                miIntent = new Intent(AceptacionServicio.this,SolicitudUsuario.class);
                break;
        }
        startActivity(miIntent);
    }
}