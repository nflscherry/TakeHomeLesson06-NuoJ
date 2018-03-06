package com.example.android.takehomelesson06_nuoj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent msIntent = getIntent();
        Calculation q = (Calculation) msIntent.getSerializableExtra(Keys.AMOUNT_KEY);
        double total = q.getAmount();
        double tax = total * q.getTaxPercentage();
        double tip = total * q.getTipPercentage();
        double grandTotal = total + tax + tip;

        TextView display = findViewById(R.id.receipt_text);
        String message = "Total: " + total;
        message = message + "\nSales Tax: " + tax;
        message = message + "\nTip: " + tip;
        message = message + "\nGrand Total: " + grandTotal;

        display.setTextSize(24);
        display.setText(message);
    }
}

