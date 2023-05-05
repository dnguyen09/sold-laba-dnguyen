package com.solvd.laba.lab2;


import com.solvd.laba.lab2.linkedList.LinkedListCustom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Account extends AccountNumber {
    /*declare properties*/
    private long accountNumber;
    private double balance;
    private String accountType;
    private Customer customer;
    private LinkedListCustom<Transaction> transactionList;

    //logger
    Logger logger = LogManager.getLogger(Account.class);

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
        this.transactionList = new LinkedListCustom<>();
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

    public LinkedListCustom<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(LinkedListCustom<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    /*Methods*/
    public void deposit(double amount) {
        balance += amount;
        transactionList.add(new Transaction(amount, "Deposit"));
        logger.info("Deposit " + amount + " successful to " + accountType);

    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            logger.info("Withdrawal failed! the amount withdrawal excess balance");
        } else {
            balance -= amount;
            transactionList.add(new Transaction(amount, "Withdraw"));
            logger.info("Withdrawal " + amount + " successful from " + accountType);
        }
    }

    public void makePurchase(double amount) {
        if (amount > balance) {
            logger.info("Purchase failed! your account don't have enough balance for making purchase");
        } else {
            balance -= amount;
            transactionList.add(new Transaction(amount, "Purchase"));
            logger.info("Purchase " + amount + " successful from " + accountType);
        }
    }


    //static block
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
