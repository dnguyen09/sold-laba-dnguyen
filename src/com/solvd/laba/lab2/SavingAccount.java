package com.solvd.laba.lab2;

public class SavingAccount extends Account {
    /*declare properties*/
    private double interestRate;

    /*constructor*/
    public SavingAccount(int accountNumber, String accountType, Customer customer, double interestRate, double balance) {
        super(accountNumber, balance, accountType, customer);
        this.interestRate = interestRate;
    }

    public SavingAccount(Account account, String accountType,  double balance, double interestRate) {
        this(account.getAccountNumber(), accountType, account.getCustomer(), interestRate, balance);
    }

    public SavingAccount(Account account, double interestRate) {
        this(account,account.getAccountType(),account.getBalance(),interestRate);
    }


    /*Getter and setters*/
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestEarned() {
        return this.getBalance() * (interestRate/100);
    }
}
