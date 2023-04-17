package com.solvd.laba.lab2;

public class Transaction {
    /*declare properties*/
    private int transactionId;
    private double amount;
    private Account sourceAccount;
    private Account receivedAccount;

    /*constructors*/
    public Transaction(int transactionId, double amount, Account sourceAccount, Account receivedAccount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.receivedAccount = receivedAccount;
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

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Account getReceivedAccount() {
        return receivedAccount;
    }

    public void setReceivedAccount(Account receivedAccount) {
        this.receivedAccount = receivedAccount;
    }
}
