package com.solvd.laba.lab2;

import java.util.ArrayList;
import java.util.List;

final public class Bank {
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
        System.out.println("Congrats " + customer.getCustomerName() + ", you have became our member!");
        customerList.add(customer);
        return new Account(customer, balance);
    }

    //method create checking account for customer
    public CheckingAccount createCheckingAccount(Account account) {
        System.out.println("Customer " + account.getCustomer().getCustomerName() + " open checking account successful");
        return  new CheckingAccount(account, "Checking account", 12);
    }

    //method create saving account for customer
    public SavingAccount createSavingAccount(Account account, double balance, double interestRate) {
        System.out.println("Customer " + account.getCustomer().getCustomerName() + " open saving account successful");
        return new SavingAccount(account, "Saving account", balance, interestRate, 10);
    }

    //method creating debit card
    public DebitCard createDebitCard(Account account) {
        System.out.println("Customer " + account.getCustomer().getCustomerName() + " has created a credit card");
        return new DebitCard(account,"Debit card", 1990);
    }

    //method check monthly service fee for checking account
    public void checkMonthlyFee(CheckingAccount checkingAccount) {
        if (checkingAccount.isMonthlyFee()) {
            System.out.println("Checking your monthly fee status...");
            System.out.println("Your balance: " + checkingAccount.getBalance() + "\n" +
                    "Your monthly fee is: " + checkingAccount.getMonthlyFee());
            checkingAccount.setBalance(checkingAccount.getBalance() - checkingAccount.getMonthlyFee());
            System.out.println("$" + checkingAccount.getMonthlyFee() + " has been deducted as monthly service fee" + "\n" +
                    "Your balance: " + checkingAccount.getBalance() + "\n" +
                    "To avoid monthly fee, please have your checking account balance greater than 500 \n");
        } else {
            System.out.println("Checking your monthly fee status...");
            System.out.println("You have no monthly service fee\n");
        }
    }

    //method checking interest rate for saving account
    public void checkInterestRate(SavingAccount acc) {
        if (acc.getBalance() < acc.getMinimumBalance()) {
            System.out.println("Your Saving account required " + acc.getMinimumBalance() +
                    " minimum balance to keep the account open");
        } else {
            System.out.println("Your interest rate: " + acc.getInterestRate());
            System.out.println("Your interest earned " + acc.getInterestEarned() + "\n");
        }
    }

    //method get card information
    public String getInfo(Account account) {
        return account.toString();
    }

    public void deposit(Account acc, double amount) {
        acc.deposit(amount);
    }

    public long getAccountNumber(Account acc) {
        return acc.getAccountNumber();
    }

    public double checkBalance(Account acc) {
        return acc.getBalance();
    }
}
