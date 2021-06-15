package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);
    }

    public void registerUsuario(View view){
        Intent miIntent = new Intent(LoginUsuario.this,RegistroUsuario.class);
        startActivity(miIntent);
    }

    public void contDatos(View view){
        Intent miIntent = new Intent(LoginUsuario.this,DatosSolicitudUsuario.class);
        startActivity(miIntent);
    }
}