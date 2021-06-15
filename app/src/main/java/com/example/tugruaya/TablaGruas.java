package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TablaGruas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_gruas);
    }

    public void volverGruas(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.btnVolverGruas:
                miIntent = new Intent(TablaGruas.this,ConsultaEmpresas.class);
                break;
        }
        startActivity(miIntent);
    }
}