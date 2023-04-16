package com.solvd.laba.lab2;

public class Account {
    /*declare properties*/
    private int accountNumber;
    private double balance;
    private String accountType;

    /*constructors*/
    public Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public Account(int accountNumber, String accountType) {
        this(accountNumber, 0, accountType);
    }

    public Account() {
        this(0,0,"");
    }

    /*getters and setters*/
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
