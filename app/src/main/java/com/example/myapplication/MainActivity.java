package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring the Widgets
    EditText editText;
    TextView valueInPounds, textView,textView6;
    Button button, button2, button3;
    CheckBox ck1;
    Switch switchButton;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        valueInPounds= findViewById(R.id.valueInPounds);
        button= findViewById(R.id.button);
        button2= findViewById(R.id.button2);
        button3= findViewById(R.id.button3);
        ck1= findViewById(R.id.checkBox2);
        textView= findViewById(R.id.textView3);
        textView6= findViewById(R.id.textView6);
        switchButton= findViewById(R.id.switch2);
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchButton.isChecked()){
                    textView6.setText(R.string.switchButton);
                }
                else{
                    textView6.setText(R.string.unSwitchButton);
                }
            }
        });
        ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck1.isChecked()){
                    textView.setText(R.string.checkButton);
                }
                else {
                    textView.setText(R.string.unCheckButton);
                }
            }
        });
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:

            default:
// If we got here, the user's action was not recognized.
// Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
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