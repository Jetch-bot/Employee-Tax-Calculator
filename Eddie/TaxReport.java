package com.Eddie;

public class TaxReport {

    private TacCalculator calculator;

//    public TaxReport(TacCalculator calculator){
//       this.calculator = calculator;
//    }

    public void show(TacCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TacCalculator calculator) {
//        this.calculator = calculator;
//    }
}
