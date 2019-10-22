package com.Eddie;

public class TaxCalculator2018
        extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        getTaxableIncome(100-000,50_000);
        return taxableIncome * 0.3;
    }
}
