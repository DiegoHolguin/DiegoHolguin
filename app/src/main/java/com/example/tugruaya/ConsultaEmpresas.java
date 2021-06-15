package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConsultaEmpresas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_empresas);
    }


    public void tablas(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.consultaConductor:
                miIntent = new Intent(ConsultaEmpresas.this,TablaConductor.class);
                break;

            case R.id.consultaGrua:
                miIntent = new Intent(ConsultaEmpresas.this,TablaGruas.class);
                break;

            case R.id.consultaSalir:
                miIntent = new Intent(ConsultaEmpresas.this,OpcionActivity.class);
                break;
        }
        startActivity(miIntent);
    }
}