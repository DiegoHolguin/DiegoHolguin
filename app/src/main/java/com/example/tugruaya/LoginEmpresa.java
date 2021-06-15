package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginEmpresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_empresa);
    }

    public void registerEmpresa(View view){
        Intent miIntent = new Intent(LoginEmpresa.this,RegistroEmpresa.class);
        startActivity(miIntent);
    }

    public void continuarEmpresa(View view){
        Intent miIntent = new Intent(LoginEmpresa.this,IngresoDatos.class);
        startActivity(miIntent);
    }
}