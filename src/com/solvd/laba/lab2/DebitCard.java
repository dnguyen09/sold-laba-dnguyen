package com.solvd.laba.lab2;

public class DebitCard {
    /*declare properties*/
    private double withdrawalLimit;
    private double spendingLimit;

    /*constructor*/

    public DebitCard(double withdrawalLimit, double spendingLimit) {
        this.withdrawalLimit = withdrawalLimit;
        this.spendingLimit = spendingLimit;
    }

    public DebitCard() {
        this(0, 0);
    }

    /*Getters and Setters*/
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getSpendingLimit() {
        return spendingLimit;
    }

    public void setSpendingLimit(double spendingLimit) {
        this.spendingLimit = spendingLimit;
    }
}
