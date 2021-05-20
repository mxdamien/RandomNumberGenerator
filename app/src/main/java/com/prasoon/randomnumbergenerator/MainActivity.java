package com.prasoon.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Get the required views
    EditText minTextView;
    EditText maxTextView;
    TextView displayView;

    public void generateNum(View view){
        try {
            //Get the values from the input views. Since the views have inputType = int, therefore, we can
            //be sure that the following method calls will always work
            int min = Integer.parseInt(minTextView.getText().toString());
            int max = Integer.parseInt(maxTextView.getText().toString());

            //If the input is valid i.e. min < max then generate the random num else display error msg
            if (min < max) {
                int randomVal = (int) (Math.random() * (max - min + 1) + min);
                displayView.setText(Integer.toString(randomVal));
            } else {
                Toast.makeText(getApplicationContext(), "Invalid Input: min cannot be greater than max", Toast.LENGTH_LONG).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minTextView = findViewById(R.id.minValInput);
        maxTextView = findViewById(R.id.maxValInput);
        displayView = findViewById(R.id.display);
    }
}