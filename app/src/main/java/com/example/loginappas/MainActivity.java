package com.example.loginappas;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        tvCount = findViewById(R.id.tvCount);

        View.OnClickListener changeListener = v -> {
            if (v.getId() == R.id.btnPlus) {
                count++;
            } else if (v.getId() == R.id.btnMinus) {
                if (count <= 0) {
                    Toast.makeText(this, R.string.error_negative, Toast.LENGTH_SHORT).show();
                    return;
                }
                count--;
            }
            tvCount.setText(String.valueOf(count));
        };

        findViewById(R.id.btnPlus).setOnClickListener(changeListener);
        findViewById(R.id.btnMinus).setOnClickListener(changeListener);


        findViewById(R.id.btnReset).setOnClickListener(v -> {
            count = 0;
            tvCount.setText("0");
        });
    }
}