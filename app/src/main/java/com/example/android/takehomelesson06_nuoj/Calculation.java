package com.example.android.takehomelesson06_nuoj;

import java.io.Serializable;

/**
 * Created by Cherry on 3/5/18.
 */

public class Calculation implements Serializable {
    private double amount;
    private double taxPercentage;
    private double tipPercentage;

    public Calculation(double amount, double taxPercentage, double tipPercentage) {
        this.amount = amount;
        this.taxPercentage = taxPercentage;
        this.tipPercentage = tipPercentage;
    }

    public double getAmount() {
        return amount;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }
}
