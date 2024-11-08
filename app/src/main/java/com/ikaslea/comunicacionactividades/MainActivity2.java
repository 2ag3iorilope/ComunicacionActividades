package com.ikaslea.comunicacionactividades;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewIzena;
    Button BaieztatuBotoia;
    Button EzeztatuBotoia;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewIzena = findViewById(R.id.textView2);
        BaieztatuBotoia = findViewById(R.id.button2);
        EzeztatuBotoia = findViewById(R.id.button3);

        Intent intent = getIntent();
        String Izena = intent.getStringExtra("izena");

        if (Izena != null) {
            textViewIzena.setText(Izena + " Baldintzak onartzen dituzu?");
        } else {
            textViewIzena.setText("Ez dago izenik.");
        }

        BaieztatuBotoia.setOnClickListener(v -> {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("emaitza", "Baieztatuta");
            setResult(RESULT_OK, resultIntent);
            finish();
        });

        EzeztatuBotoia.setOnClickListener(v -> {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("emaitza", "Ezeztatuta");
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}
