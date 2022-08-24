package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    EditText e3;
    RadioGroup r;
    RadioButton m;
    RadioButton f;
    Switch s;
    CheckBox c;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    Toast.makeText(MainActivity.this, "Submit Success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Submit Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean validate() {
        boolean flag = false;
        String fn = e1.getText().toString();
        String ln = e2.getText().toString();
        String p = e3.getText().toString();

        if (fn.equals("")) {
            Toast.makeText(this, "First name can't be empty", Toast.LENGTH_SHORT).show();
        }
        else if (ln.equals("")){
            Toast.makeText(this, "Last name can't be empty", Toast.LENGTH_SHORT).show();
        }
        else if (p.length()<=3){
            Toast.makeText(this, "Password should contain at least 3 characters", Toast.LENGTH_SHORT).show();
        }
        else if (!m.isChecked() && !f.isChecked()){
            Toast.makeText(this, "Gender must be chosen", Toast.LENGTH_SHORT).show();
        }
        else if (!s.isChecked()){
            Toast.makeText(this, "Must be a new user", Toast.LENGTH_SHORT).show();
        }
        else if (!c.isChecked()){
            Toast.makeText(this, "Must agree to proceed", Toast.LENGTH_SHORT).show();
        }
        else {
            flag=true;
            Toast.makeText(this, "Successfully Registered", Toast.LENGTH_SHORT).show();
        }
        return flag;
    }


    private void initUI() {
        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);
        e3=findViewById(R.id.editTextTextPersonName3);
        r=findViewById(R.id.radioGroup);
        m=findViewById(R.id.radioButton);
        f=findViewById(R.id.radioButton2);
        s=findViewById(R.id.switch1);
        c=findViewById(R.id.checkBox);
        b=findViewById(R.id.button);
    }
}