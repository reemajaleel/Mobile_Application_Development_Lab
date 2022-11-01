package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] items={"Omal","Mazin","Reema","Farhan","Faliha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(arrayAdapter);
    }
}