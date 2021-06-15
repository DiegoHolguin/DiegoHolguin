package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TablaConductor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_conductor);
    }

    public void volverConductor(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.btnVolverConductores:
                miIntent = new Intent(TablaConductor.this,ConsultaEmpresas.class);
                break;
        }
        startActivity(miIntent);
    }

}