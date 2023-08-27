package com.example.cricketchirpsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btnCalculate;
    EditText numChirps;
    TextView results;
    DecimalFormat formatter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate = findViewById(R.id.btnCalculate);
        numChirps = findViewById(R.id.inputNumber);
        results = findViewById(R.id.txtResults);
        formatter = new DecimalFormat("#0.00");

        results.setVisibility(View.GONE);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numChirps.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please fill in all fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int chirps = Integer.parseInt(numChirps.getText().toString().trim());
                    double res = (chirps / 3.0)+ 4;
                    String fin = "The Approximate temperature outside is "+formatter.format(res)+" degrees Celsius.";
                    results.setText(fin);
                    results.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}