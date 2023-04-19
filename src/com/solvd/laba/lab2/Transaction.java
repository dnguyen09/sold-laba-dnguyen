package com.solvd.laba.lab2;

public class Transaction {
    /*declare properties*/
    private int transactionId;
    private double amount;
    private Account fromAccount;
    private Account toAccount;

    /*constructors*/
    public Transaction(int transactionId, double amount, Account fromAccount, Account toAccount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public Transaction(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public Transaction() {
        this(0, 0.0, null, null);
    }

    /*Getters and setters*/
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    /*Methods*/

}
