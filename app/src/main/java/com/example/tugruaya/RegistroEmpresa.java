package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroEmpresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_empresa);
    }

    public void continuarEmpresa(View view){
        Intent miIntent = new Intent(RegistroEmpresa.this,IngresoDatos.class);
        startActivity(miIntent);
    }
}