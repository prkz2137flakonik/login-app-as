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

        btn7.setOnClickListener(v -> append7());
        btn8.setOnClickListener(v -> append8());
        btn9.setOnClickListener(v -> append9());
    }

    private void append7() {
        tvDisplay.setText(tvDisplay.getText().toString() + "7");
    }

    private void append8() {
        tvDisplay.setText(tvDisplay.getText().toString() + "8");
    }

    private void append9() {
        tvDisplay.setText(tvDisplay.getText().toString() + "9");
    }
}