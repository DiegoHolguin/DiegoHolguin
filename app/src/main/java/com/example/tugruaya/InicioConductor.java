package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioConductor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_conductor);
    }

    public void ButonOcupado(View view) {
        Intent miIntent = new Intent(InicioConductor.this,ServicioEnCurso.class);
        startActivity(miIntent);
    }

    public void iniDesconectar(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.btnIniDesconectar:
                miIntent = new Intent(InicioConductor.this,OpcionActivity.class);
                break;
        }
        startActivity(miIntent);
    }
}