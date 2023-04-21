package com.solvd.laba.lab2;

public class CreditCard {
    /*declare properties*/
    private int creditCardNum;
    private double creditLimit;

    /*constructor*/
    public CreditCard(int creditCardNum, double creditLimit) {
        this.creditCardNum = creditCardNum;
        this.creditLimit = creditLimit;
    }

    public CreditCard() {
        this(0,0);
    }

    /*Getters and setters*/
    public int getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(int creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
