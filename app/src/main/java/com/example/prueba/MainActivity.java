package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText valor1 = findViewById(R.id.valor1);
        EditText valor2 = findViewById(R.id.valor2);
        TextView resultado = findViewById(R.id.resultado);
        Button boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto1 = valor1.getText().toString();
                int numero1 = Integer.parseInt(texto1);

                String texto2 = valor2.getText().toString();
                int numero2 = Integer.parseInt(texto2);

                int resultadofinal = numero1 + numero2;

                resultado.setText(String.valueOf(resultadofinal));

            }
        });
    }
}