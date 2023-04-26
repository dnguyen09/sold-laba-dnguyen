package com.solvd.laba.lab2;

import java.util.Random;

public class CheckingAccount extends Account {
    /*declare properties*/
    private double monthlyFee;

    /*constructors*/
    public CheckingAccount(int accountNumber, String accountType, Customer cus, double monthlyFee, double balance) {
        super(accountNumber, balance, accountType, cus);
        this.monthlyFee = monthlyFee;
    }

    public CheckingAccount(Account account, String accountType, double balance, double monthlyFee) {
        this(account.getAccountNumber(), accountType, account.getCustomer(), monthlyFee, balance);
    }

    public CheckingAccount(Account account, String accountType, double monthlyFee) {
        super(account.getCustomer(), account.getBalance());
        this.setAccountType(accountType);
        this.setAccountNumber(generateNumber());
        this.monthlyFee = monthlyFee;
    }

    /*getters and setters*/
    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    /*methods*/
    public boolean isMonthlyFee() {
        if (getBalance() < 500) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int generateNumber() {
        String idChecking = "1213";
        Random random = new Random();
        int randChecking = random.nextInt(100000);
        //Concat String with lastAccNum to not get same number generated
        String checkingAccNum = idChecking + String.valueOf(randChecking) + String.valueOf(lastAccNum);
        lastAccNum++;
        return Integer.parseInt(checkingAccNum);
    }


}
