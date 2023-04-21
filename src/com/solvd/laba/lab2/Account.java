package com.solvd.laba.lab2;

public class Account {
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

    public Account(int accountNumber, String accountType, Customer cus) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customer = cus;
    }

    public Account() {
        this(0,0,"",null);
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
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }


}
