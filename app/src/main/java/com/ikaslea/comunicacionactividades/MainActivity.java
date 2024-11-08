package com.ikaslea.comunicacionactividades;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextIzena;
    Button BerifikatuBotoia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    editTextIzena = findViewById(R.id.editTextText);
    BerifikatuBotoia = findViewById(R.id.button);

        BerifikatuBotoia.setOnClickListener(v -> {
            String Izena = editTextIzena.getText().toString();


            Intent intent = new Intent(MainActivity.this, MainActivity2.class);


            intent.putExtra("izena", Izena);


            startActivity(intent);
        });
    }
}