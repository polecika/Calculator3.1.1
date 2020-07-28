package com.example.calculator311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView calculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void onNumberCkick(View view) {
        Button button = (Button) view;
        String newNumber = button.getText().toString();
        String calculatorText = calculator.getText().toString();
        String firstSimbol = "" + calculatorText.charAt(0);
        if ( firstSimbol.equals("0") && !calculatorText.contains(".")) {
            if(!newNumber.equals("0")) {
                calculator.setText(calculatorText.substring(1));
                calculator.append(newNumber);
            }
        } else {
            calculator.append(newNumber);
        }
    }
    public void onPointkick(View view) {
        Button button = (Button) view;
        String newNumber = button.getText().toString();
        String calculatorText = calculator.getText().toString();
        if ( !calculatorText.contains(".")) {
            calculator.append(newNumber);
        }
    }
    public void init() {
        calculator = (TextView) findViewById(R.id.calculator);
    }
}