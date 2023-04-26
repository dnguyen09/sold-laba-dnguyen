package com.solvd.laba.lab2;

import java.util.Random;

public class SavingAccount extends Account {
    /*declare properties*/
    private double interestRate;
    private double minimumBalance;

    /*constructor*/

    public SavingAccount(int accountNumber, double balance, String accountType, Customer customer, double interestRate, double minimumBalance) {
        super(accountNumber, balance, accountType, customer);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    public SavingAccount(Account account, String accountType, double balance, double interestRate, double minimumBalance) {
        super(account.getCustomer(), 0);
        this.setAccountType(accountType);
        this.setAccountNumber(generateNumber());
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    /*Getter and setters*/
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    /*methods*/
    public double getInterestEarned() {
        return this.getBalance() * (interestRate/100);
    }

    public int generateNumber() {
        String idSaving = "1314";
        Random random = new Random();
        int randSaving = random.nextInt(100000);
        //Concat String with lastAccNum to not get same number generated
        String SavingAccNum = idSaving + String.valueOf(randSaving) + String.valueOf(lastAccNum);
        lastAccNum++;
        return Integer.parseInt(SavingAccNum);
    }
}
