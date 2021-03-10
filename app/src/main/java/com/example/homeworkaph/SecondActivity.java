package com.example.homeworkaph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // creamos objeto intent y usamos el método getIntent el cual devuelve un intent si es que hay alguno disponible
        Intent intent = getIntent();
        //el string guarda wl objeto obtenido de la la primera activity
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Obtenemos la referencia de nuestro textView para luego agregarle el texto recibido del main activity
        TextView textView = findViewById(R.id.txt_count);
        //colocamos el mensaje que se ha recibido mediante la clave-valor de nuestra priemra Activity y lo colocamos en el TextView
        textView.setText(message);

    }
}