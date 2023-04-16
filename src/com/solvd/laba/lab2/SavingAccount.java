package com.solvd.laba.lab2;

public class SavingAccount {
    /*declare properties*/
    private double interestRate;
    private double monthlyDepositLimit;

    /*constructor*/
    public SavingAccount (double interestRate, double monthlyDepositLimit) {
        this.interestRate = interestRate;
        this.monthlyDepositLimit = monthlyDepositLimit;
    }

    public SavingAccount (){
        this(0,0);
    }

    /*Getter and setters*/
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonthlyDepositLimit() {
        return monthlyDepositLimit;
    }

    public void setMonthlyDepositLimit(double monthlyDepositLimit) {
        this.monthlyDepositLimit = monthlyDepositLimit;
    }
}
