package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UbicacionUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion_usuario);
    }

    public void soliGrua(View view){
        Intent miIntent = new Intent(UbicacionUsuario.this,SolicitudUsuario.class);
        startActivity(miIntent);
    }
    
}