package com.example.tugruaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginConductor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_conductor);
    }

    public void ConstContinuar(View view){
        Intent miIntent = new Intent(LoginConductor.this,InicioConductor.class);
        startActivity(miIntent);
    }

}