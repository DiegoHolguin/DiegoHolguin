package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroGruas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_gruas);
    }

    public void registrosConductores(View view){
        Intent miIntent = new Intent(RegistroGruas.this,RegistroConductores.class);
        startActivity(miIntent);
    }
}