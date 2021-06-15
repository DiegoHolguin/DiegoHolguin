package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DatosSolicitudUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_solicitud_usuario);
    }

    public void contSolicitud(View view){
        Intent miIntent = new Intent(DatosSolicitudUsuario.this,UbicacionUsuario.class);
        startActivity(miIntent);
    }
}