package com.solvd.laba.lab2;

import java.util.Random;

public class Account extends AccountNumber {
    /*declare properties*/
    private long accountNumber;
    private double balance;
    private String accountType;
    private Customer customer;

    /*constructors*/
    public Account(long accountNumber, double balance, String accountType, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.customer = customer;
    }

    public Account(long accountNumber, String accountType, Customer customer) {
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
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
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
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit " + amount + " successful to " + accountType );
    }

    static {
        lastAccNum = 0;
    }

    @Override
    public long generateNumber() {
        String idAccount = "1010";
        Random random = new Random();
        int randAccNum = random.nextInt(100000) + 1000;    //generate  integer (1000 - 99999)
        String accountNum = idAccount + String.valueOf(randAccNum) + String.valueOf(lastAccNum);
        lastAccNum++;
        return Long.parseLong(accountNum);
    }

}
