package com.Saul.Mejia.Rivera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;
    private Button buttonResta;
    private Button buttonDiv;
    private Button buttonMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSuma = findViewById(R.id.buttonSuma );
        buttonSuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirSuma();
            }

        });

        buttonResta = findViewById(R.id.buttonResta );
        buttonResta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirResta();
            }

        });

        buttonDiv = findViewById(R.id.buttonDiv );
        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirDiv();
            }

        });

        buttonMulti = findViewById(R.id.buttonMulti );
        buttonMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirMulti();
            }

        });
    }


    private void abrirSuma(){
        Intent intent = new Intent(this, SumaActivity.class);
        startActivity(intent);
    }
    private void abrirResta(){
        Intent intent = new Intent(this, RestaActivity.class);
        startActivity(intent);
    }
    private void abrirDiv(){
        Intent intent = new Intent(this, DivActivity.class);
        startActivity(intent);
    }
    private void abrirMulti(){
        Intent intent = new Intent(this, MultiActivity.class);
        startActivity(intent);
    }
}