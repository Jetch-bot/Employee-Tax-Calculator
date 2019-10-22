package com.Eddie;

public class employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public employee(int baseSalary){
       this(baseSalary, 0);
    }

    public employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    public int calculateWage (int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage (){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary <=0)
            throw new IllegalArgumentException ("Salary cannot be less than 0 ");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hours cannot be less than 0 ");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }

}
