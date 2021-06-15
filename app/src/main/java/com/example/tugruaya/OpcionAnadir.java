package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OpcionAnadir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_anadir);
    }

    public void consultarEmpresas(View view){
        Intent miIntent = new Intent(OpcionAnadir.this,ConsultaEmpresas.class);
        startActivity(miIntent);
    }

    public void btnOpcionAñadir(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.añadirConductor:
                miIntent = new Intent(OpcionAnadir.this,RegistroConductores.class);
                break;

            case R.id.añadirGrua:
                miIntent = new Intent(OpcionAnadir.this,RegistroGruas.class);
                break;
        }
        startActivity(miIntent);
    }

}