package com.solvd.laba.lab2;

import java.util.ArrayList;
import java.util.LinkedList;

final public class Bank {
    /*declare properties*/
    private String name;
    private String location;
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

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    /*methods*/

    //method to print message if customer is qualified
    public String makeCreditCheck(Customer customer) throws CreditCheckException {
        String qualificationStatus = CreditCheck.isQualifyAcc(customer);
        System.out.println("Hi " + customer.getCustomerName() + "! based on your date of birth " +
                customer.getDateOfBirth() + " and your credit score " + customer.getCreditScore() + "\n" +
                "Here are your result:");
        if (qualificationStatus.equals("Qualified")) {
            return "Congratulation! You are qualified for credit.\n";
        } else {
            return ("Sorry, your account does not qualify \n" + qualificationStatus);
        }
    }

    //method to store customer information
    public Account createAccount(Customer customer, int balance) {
        System.out.println("Congrats " + customer.getCustomerName() + ", you have became our customer!");
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
        System.out.println("Customer " + account.getCustomer().getCustomerName() + " has created a debit card");
        return new DebitCard(account,"Debit card", 1990);
    }

    //method creating credit card
    public CreditCard createCreditCard(Account account) {
        System.out.println("Customer " + account.getCustomer().getCustomerName() + " has created a credit card");
        return new CreditCard(account,"Credit card",1021);
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

    //method checking minimum payment for credit card
    public void checkMinPayment(CreditCard creditCard) {
        System.out.println("\nChecking your monthly minimum payment...");
        System.out.println("Minimum payment this month: " + creditCard.calculateMinPayment());
        System.out.println("Your outstanding balance: " + creditCard.getBalance());
    }

    //method checking interest rate for saving account
    public void checkInterestRate(SavingAccount acc) {
        if (acc.getBalance() < acc.getMinimumBalance()) {
            System.out.println("Checking your interest rate...");
            System.out.println("Your Saving account required " + acc.getMinimumBalance() +
                    " minimum balance to keep the account open");
        } else {
            System.out.println("Checking your interest rate...");
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

    public void withdrawal(Account account, double amount) {
        //throw exception if a withdrawal is made from credit card
        if (account instanceof CreditCard) {
            throw new WithdrawalException("Cannot withdraw from a credit card.");
        }
        account.withdrawal(amount);
    }

    public void makePurchase(Account account, double amount) {
        account.makePurchase(amount);
    }

    //method to get transaction history of account
    public LinkedList<Transaction> getTransactionsHistory(Account account) {
        return account.getTransactionList();
    }

    //method to get account number from account
    public long getAccountNumber(Account acc) {
        return acc.getAccountNumber();
    }

    public String checkBalance(CreditCard acc) {
        return "Your Outstanding balance: " + acc.getBalance()+ "\n";
    }

    public String checkBalance(Account acc) {
        return "Your balance: " + acc.getBalance()+ "\n";
    }


}
