package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroConductores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_conductores);
    }

    public void deseasAñadir(View view){
        Intent miIntent = new Intent(RegistroConductores.this,OpcionAnadir.class);
        startActivity(miIntent);
    }
}