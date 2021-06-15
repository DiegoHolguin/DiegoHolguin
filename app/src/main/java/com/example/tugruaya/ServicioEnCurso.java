package com.example.tugruaya;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ServicioEnCurso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio_en_curso);

        findViewById(R.id.FinalServicio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogo();
            }
        });

    }

    //muestra el dialogo en la vista Servicio_en_curso
    private void mostrarDialogo(){
        AlertDialog.Builder builder = new AlertDialog.Builder(ServicioEnCurso.this);

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.dialogo_servicio_curso, null);

        builder.setView(view);

        //Caja de texto - alerta de texto

        AlertDialog dialog = builder.create();
        dialog.show();

        //Texto de la alerta
        TextView txt = view.findViewById(R.id.btnDialogoSalir);
        txt.setText("¿Seguro que quieres abandonar el servicio?");

        //Funcion boton aceptar
        Button btnAceptar = view.findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miIntent = null;

                switch (view.getId()){
                    case R.id.btnAceptar:
                        miIntent = new Intent(ServicioEnCurso.this,OpcionActivity.class);
                        break;

                }
                startActivity(miIntent);
            }
        });

        Button btnCancelar = view.findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cancelado...", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        //TODO set Cancel onClickListener
    }

    public void servicioDesconectar(View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.btnServicioDesconectar:
                miIntent = new Intent(ServicioEnCurso.this,OpcionActivity.class);
                break;

        }
        startActivity(miIntent);
    }
}