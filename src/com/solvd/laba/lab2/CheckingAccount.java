package com.solvd.laba.lab2;

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

    public CheckingAccount(Account account, double monthlyFee) {
        this(account.getAccountNumber(), account.getAccountType(), account.getCustomer(), monthlyFee, account.getBalance());
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
        if (this.getBalance() < 500) {
            return true;
        } else {

            return false;
        }
    }

    public void chargeMonthlyFee() {
        if (isMonthlyFee()) {
            this.setBalance(this.getBalance() - monthlyFee);
            System.out.println("$" + monthlyFee + " has been deducted as monthly fee.");
        } else {
            System.out.println("You have no monthly service fee");
        }
    }
}
