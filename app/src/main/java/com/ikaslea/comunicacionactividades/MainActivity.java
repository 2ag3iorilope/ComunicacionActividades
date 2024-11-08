package com.ikaslea.comunicacionactividades;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextIzena;
    Button BerifikatuBotoia;
    TextView textView;

    ActivityResultLauncher<Intent> startActivityForResult;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextIzena = findViewById(R.id.editTextText);
        BerifikatuBotoia = findViewById(R.id.button);
        textView = findViewById(R.id.textView3);

        startActivityForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK) {
                Intent data = result.getData();
                String resultado = data != null ? data.getStringExtra("emaitza") : "Ez da ezer lortu";
                textView.setText("Email: " + resultado);
            }
        });

        BerifikatuBotoia.setOnClickListener(v -> {
            String Izena = editTextIzena.getText().toString();

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("izena", Izena);

            startActivityForResult.launch(intent);
        });
    }
}
