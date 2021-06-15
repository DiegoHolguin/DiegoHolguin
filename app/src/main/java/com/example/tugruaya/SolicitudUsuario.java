package com.example.tugruaya;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SolicitudUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud_usuario);
    }

    //Se desplata hacia la diguiente vista - AceptacionServicio
    public void AceptacionServicio(View view){
        Intent miIntent = new Intent(SolicitudUsuario.this,AceptacionServicio.class);
        startActivity(miIntent);
    }


    //Vuelve a la vista Ubicacionsuario
    public void atrasSolicitudUsu(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.desconectarSoliUsu:
                miIntent = new Intent(SolicitudUsuario.this,UbicacionUsuario.class);
                break;
        }
        startActivity(miIntent);
    }
}