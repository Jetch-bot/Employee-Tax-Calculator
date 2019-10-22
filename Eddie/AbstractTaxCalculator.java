package com.Eddie;

public  abstract class AbstractTaxCalculator
implements TacCalculator {

    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
