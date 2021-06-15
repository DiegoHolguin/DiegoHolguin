package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngresoDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_datos);
    }

    public void continuarRegistros(View view){
        Intent miIntent = new Intent(IngresoDatos.this,RegistroGruas.class);
        startActivity(miIntent);
    }
}