package com.example.myapplication.ejBonoLoto;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainBonoLoto extends AppCompatActivity {

    Button elegir;
    TextView idNum1,idNum2, idNum3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bono_loto);

        elegir = findViewById(R.id.idBotonElegir);
        idNum1 = findViewById(R.id.idNum1);
        idNum2 = findViewById(R.id.idNum2);
        idNum3 = findViewById(R.id.idNum3);

        ActivityResultLauncher<Intent> lanzadora = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), (result)->{
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // Here, no request code
                        Intent data = result.getData();
                        idNum1.setText(data.getStringExtra("NUMERO1"));
                        idNum2.setText(data.getStringExtra("NUMERO2"));
                        idNum2.setText(data.getStringExtra("NUMERO3"));
                    }
                }
        );
        elegir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainBonoLoto.this, ElegirNumeros.class);
                lanzadora.launch(intent);
            }
        });
    }
}