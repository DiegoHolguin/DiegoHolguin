package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Calificacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificacion);
    }

    //Vuelve a la vista LoginUsuario
    public void ahoraNo(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.AhoraNo:
                miIntent = new Intent(Calificacion.this,LoginUsuario.class);
                break;
        }
        startActivity(miIntent);
    }
}