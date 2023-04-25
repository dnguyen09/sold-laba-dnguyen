package com.solvd.laba.lab2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    /*declare properties*/
    private String name;
    private String location;
    private List<Account> accounts;
    private final ArrayList<Customer> customerList;

    /*constructor*/
    public Bank (String name, String location) {
        this.name = name;
        this.location = location;
        this.customerList = new ArrayList<>();
    }

    public Bank() {
        this("", "");
    }

    /*getter and setter*/
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    };

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    /*methods*/
    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    //method to print message if customer is qualified
    public String makeCreditCheck(Customer customer) {
        String qualificationStatus = CreditCheck.isQualifyAcc(customer);
        System.out.println("Hi " + customer.getCustomerName() + "! based on your date of birth " +
                customer.getDateOfBirth() + " and your credit score " + customer.getCreditScore() +"\n" +
                "Here are your result:");
        if (qualificationStatus.equals("Qualified")) {
            return "Congratulation! You are qualified for credit.\n";
        } else {
            return "Sorry, your account does not qualify \n" + qualificationStatus;
        }
    }

    //method to store customer information
    public Account createAccount(Customer customer, int balance) {
        System.out.println("Congrats, you have became our member");
        customerList.add(customer);
        return new Account(customer, balance);
    }

    public CheckingAccount createCheckingAccount(Account account) {
        return  new CheckingAccount(account, "Checking account", 12);
    }

    public void checkMonthlyFee(CheckingAccount checkingAccount) {
        if (checkingAccount.isMonthlyFee()) {
            System.out.println("Your balance: " + checkingAccount.getBalance() + "\n" +
                    "Your monthly fee is: " + checkingAccount.getMonthlyFee());
            checkingAccount.setBalance(checkingAccount.getBalance() - checkingAccount.getMonthlyFee());
            System.out.println("$" + checkingAccount.getMonthlyFee() + " has been deducted as monthly service fee" + "\n" +
                    "Your balance: " + checkingAccount.getBalance() + "\n" +
                    "To avoid monthly fee, please have your balance greater than 500");
        } else {
            System.out.println("You have no monthly service fee");
        }
    }

    public void depositCheckingAcc(CheckingAccount acc, double amount) {
        acc.setBalance(acc.getBalance() + amount);
    }
}
