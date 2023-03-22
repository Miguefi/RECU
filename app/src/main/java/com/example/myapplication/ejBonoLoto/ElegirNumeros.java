package com.example.myapplication.ejBonoLoto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.myapplication.R;

public class ElegirNumeros extends AppCompatActivity {

    CheckBox check1,check2,check3,check4,check5,check6,check7,check8,check9,check10;
    Button idAcceptar, idCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_numeros);

        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check4);
        check5 = findViewById(R.id.check5);
        check6 = findViewById(R.id.check6);
        check7 = findViewById(R.id.check7);
        check8 = findViewById(R.id.check8);
        check9 = findViewById(R.id.check9);
        check10 = findViewById(R.id.check10);
        idAcceptar = findViewById(R.id.idAcceptar);
        idCancelar = findViewById(R.id.idCancelar);


    }
}