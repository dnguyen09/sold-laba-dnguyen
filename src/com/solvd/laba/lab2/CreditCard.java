package com.solvd.laba.lab2;

public class CreditCard {
    /*declare properties*/
    private String holderName;
    private double creditLimit;

    /*constructor*/
    public CreditCard(String holderName, double creditLimit) {
        this.holderName = holderName;
        this.creditLimit = creditLimit;
    }

    public CreditCard() {
        this("",0);
    }

    /*Getters and setters*/
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
