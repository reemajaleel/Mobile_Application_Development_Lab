package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextTextPersonName2);
        e2=findViewById(R.id.editTextTextPersonName);
        b1=findViewById(R.id.addition);
        b2=findViewById(R.id.subtraction);
        b3=findViewById(R.id.multiplication);
        b4=findViewById(R.id.division);
        t1=findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a+b;
                t1.setText("Addition = "+c);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a-b;
                t1.setText("Subtraction = "+c);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a*b;
                t1.setText("Multiplication = "+c);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a/b;
                t1.setText("Divisoin = "+c);
            }
        });
    }
}