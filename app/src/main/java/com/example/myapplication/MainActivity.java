package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring the Widgets
    EditText editText;
    TextView valueInPounds;
    Button button, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        valueInPounds= findViewById(R.id.valueInPounds);
        button= findViewById(R.id.button);
        button2= findViewById(R.id.button2);
        button3= findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertFromKiloToPound();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converFromKiloToGrams();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertFromKiloToTonne();
            }
        });
    }

    private void convertFromKiloToTonne() {
        String valueEnteredInKilo= editText.getText().toString();
        double kilo = Double.parseDouble(valueEnteredInKilo);
        double tonne= kilo /  1000;
        valueInPounds.setText("" + tonne);
    }

    private void converFromKiloToGrams() {
        String valueEnteredInKilo= editText.getText().toString();
        double kilo = Double.parseDouble(valueEnteredInKilo);
        double grams= kilo *  1000;
        valueInPounds.setText("" + grams);
    }

    private void convertFromKiloToPound() {
        String valueEnteredInKilo= editText.getText().toString();
        double kilo = Double.parseDouble(valueEnteredInKilo);
        double pounds= kilo *  2.205;
        valueInPounds.setText("" + pounds);
    }
}