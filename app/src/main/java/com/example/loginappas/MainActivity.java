package com.example.loginappas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplay;

    private double storedValue = 0;
    private String operation = "";
    private boolean startNewNumber = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tvDisplay = findViewById(R.id.tvDisplay);


        View.OnClickListener symbolListener =
                v -> appendSymbol(((Button) v).getText().toString());

        int[] symbolIds = {
                R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
                R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9,
                R.id.btnComma
        };
        for (int id : symbolIds) {
            findViewById(id).setOnClickListener(symbolListener);
        }


        View.OnClickListener operationListener = v -> {
            if (v.getId() == R.id.btnAdd) {
                setOperation("+");
            } else if (v.getId() == R.id.btnSub) {
                setOperation("-");
            } else if (v.getId() == R.id.btnMul) {
                setOperation("*");
            } else {
                setOperation("/");
            }
        };
        findViewById(R.id.btnAdd).setOnClickListener(operationListener);
        findViewById(R.id.btnSub).setOnClickListener(operationListener);
        findViewById(R.id.btnMul).setOnClickListener(operationListener);
        findViewById(R.id.btnDiv).setOnClickListener(operationListener);
    }

    private void appendSymbol(String symbol) {
        String current = tvDisplay.getText().toString();

        if (startNewNumber) {
            tvDisplay.setText(symbol.equals(",") ? "0," : symbol);
            startNewNumber = false;
            return;
        }
        if (symbol.equals(",") && current.contains(",")) {
            return;
        }
        tvDisplay.setText(current + symbol);
    }

    private void setOperation(String newOperation) {
        storedValue = readDisplay();
        operation = newOperation;
        startNewNumber = true;
    }

    private double readDisplay() {
        String text = tvDisplay.getText().toString().replace(',', '.');
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}