package com.example.android.takehomelesson06_nuoj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText amountView;
    private EditText taxView;
    private EditText tipView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountView = findViewById(R.id.amount_text);
        taxView = findViewById(R.id.taxPercent_text);
        tipView = findViewById(R.id.tipPercent_text);
    }

    public void submit(View view) {
        double amount = Double.parseDouble(amountView.getText().toString());
        double tax = Double.parseDouble(taxView.getText().toString());
        double tip = Double.parseDouble(tipView.getText().toString());
        Calculation newCalculation = new Calculation(amount, tax, tip);
        Intent mrIntent = new Intent(this, DisplayActivity.class);
        mrIntent.putExtra(Keys.AMOUNT_KEY, newCalculation);
        startActivity(mrIntent);
    }
}
