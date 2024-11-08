package com.ikaslea.comunicacionactividades;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewIzena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewIzena = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String Izena = intent.getStringExtra("izena");
        String Testua = textViewIzena.getText().toString();
        textViewIzena.setText( Testua + " " + Izena);



    }
}