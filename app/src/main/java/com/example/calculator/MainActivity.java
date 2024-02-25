package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText txtNum1, txtNum2;
    Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txtResult);
        txtNum1 = (EditText) findViewById(R.id.txtnum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        btnAdd = (Button) findViewById(R.id.button1);
        btnSub = (Button) findViewById(R.id.button2);
        btnMul = (Button) findViewById(R.id.button3);
        btnDiv = (Button) findViewById(R.id.button4);

        btnAdd.setOnClickListener(v -> {
            int myNum1 = Integer.parseInt(txtNum1.getText().toString());
            int myNum2 = Integer.parseInt(txtNum2.getText().toString());
            int sum = myNum1 + myNum2;

            txtResult.setText(String.valueOf(sum));
        });
        btnSub.setOnClickListener(v -> {

            double myNum1 = Double.parseDouble(txtNum1.getText().toString());
            double myNum2 = Double.parseDouble(txtNum2.getText().toString());
            double dif = myNum1 - myNum2;

            txtResult.setText(String.valueOf(dif));
        });
        btnMul.setOnClickListener(v -> {

            double myNum1 = Double.parseDouble(txtNum1.getText().toString());
            double myNum2 = Double.parseDouble(txtNum2.getText().toString());
            double product = myNum1 * myNum2;

            txtResult.setText(String.valueOf(product));
        });
        btnDiv.setOnClickListener(v -> {

            double myNum1 = Double.parseDouble(txtNum1.getText().toString());
            double myNum2 = Double.parseDouble(txtNum2.getText().toString());
            double quotient = myNum1 / myNum2;

            txtResult.setText(String.valueOf(quotient));
        });
    }
}





