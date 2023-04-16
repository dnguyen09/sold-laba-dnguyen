package com.solvd.laba.lab2;

public class CheckingAccount {
    /*declare properties*/
    private double monthlyFee;
    private int maxWithdrawal;
    private double minimumBalance;

    /*constructors*/
    public CheckingAccount(double monthlyFee, int maxWithdrawal, double minimumBalance) {
        this.monthlyFee = monthlyFee;
        this.maxWithdrawal = maxWithdrawal;
        this.minimumBalance = minimumBalance;
    }

    public CheckingAccount() {
        this(0,0,0);
    }

    /*getters and setters*/
    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getMaxWithdrawal() {
        return maxWithdrawal;
    }

    public void setMaxWithdrawal(int maxWithdrawal) {
        this.maxWithdrawal = maxWithdrawal;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}
