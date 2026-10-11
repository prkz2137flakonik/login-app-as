package com.example.loginappas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tvDisplay = findViewById(R.id.tvDisplay);

        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        btn7.setOnClickListener(v -> appendSymbol("7"));
        btn8.setOnClickListener(v -> appendSymbol("8"));
        btn9.setOnClickListener(v -> appendSymbol("9"));
    }

    private void appendSymbol(String symbol) {
        tvDisplay.setText(tvDisplay.getText().toString() + symbol);
    }
}