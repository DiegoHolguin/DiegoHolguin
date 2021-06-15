package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OpcionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion);
    }

    public void constructor(View view){
        Intent miIntent = new Intent(OpcionActivity.this,LoginConductor.class);
        startActivity(miIntent);
    }

    public void empresa(View view){
        Intent miIntent = new Intent(OpcionActivity.this,LoginEmpresa.class);
        startActivity(miIntent);
    }

    public void usuario(View view){
        Intent miIntent = new Intent(OpcionActivity.this,LoginUsuario.class);
        startActivity(miIntent);
    }
}