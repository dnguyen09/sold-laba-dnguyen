package com.solvd.laba.lab2;

import java.util.Random;

public class Account extends AccountNumber {
    /*declare properties*/
    private int accountNumber;
    private double balance;
    private String accountType;
    private Customer customer;

    /*constructors*/
    public Account(int accountNumber, double balance, String accountType, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.customer = customer;
    }

    public Account(int accountNumber, String accountType, Customer customer) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customer = customer;
    }

    public Account(Customer customer, double balance) {
        this.accountNumber = generateNumber();
        this.balance = balance;
        this.accountType = "";
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /*Methods*/
    @Override
    public int generateNumber() {
        String idAccount = "1010";
        Random random = new Random();
        int randAccNum = random.nextInt(100000);
        String accountNum = idAccount + String.valueOf(randAccNum) + String.valueOf(lastAccNum);
        return Integer.parseInt(accountNum);
    }
}
