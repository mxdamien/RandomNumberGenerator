package com.prasoon.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void generateNum(View view){
        EditText minTextView = (EditText) findViewById(R.id.minValInput);
        EditText maxTextView = (EditText) findViewById(R.id.maxValInput);

        int min = Integer.parseInt(minTextView.getText().toString());
        int max = Integer.parseInt(maxTextView.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}