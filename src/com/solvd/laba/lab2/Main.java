package com.solvd.laba.lab2;

import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Chase", "Irvine, WY");
        Customer cus1 = new Customer("John","12-15-1991",570);
        Customer cus2 = new Customer("Doe","11-22-1979", 660);

        try {
            String result1 = bank.makeCreditCheck(cus1);
            System.out.println(result1);
            String result2 = bank.makeCreditCheck(cus2);
            System.out.println(result2);
        }  catch (CreditCheckException e) {
            System.out.println("Error while processing credit check for customer " + e.getMessage());
        }


        Account account1 = bank.createAccount(cus1, 400);
        System.out.println("Account number: " + bank.getAccountNumber(account1) + "\n");
        Account account2 = bank.createAccount(cus2, 4000);
        System.out.println("Account number: " + bank.getAccountNumber(account2));
        System.out.println();

        CheckingAccount check1 = bank.createCheckingAccount(account1);
        System.out.println("Checking number: " + bank.getAccountNumber(check1));
        CheckingAccount check2 = bank.createCheckingAccount(account2);
        System.out.println("Checking number: " + bank.getAccountNumber(check2) + "\n");


        bank.checkMonthlyFee(check1);
        bank.deposit(check1, 1000);
        System.out.println(bank.checkBalance(check1));
        bank.checkMonthlyFee(check1);

        SavingAccount save1 = bank.createSavingAccount(account1, 0, 0.15);
        System.out.println("Saving number: " + bank.getAccountNumber(save1));
        System.out.println(bank.checkBalance(save1));
        bank.checkInterestRate(save1);
        bank.deposit(save1, 2000);
        System.out.println( bank.checkBalance(save1));
        bank.checkInterestRate(save1);


        DebitCard debitCard1 = bank.createDebitCard(account1);
        System.out.println(bank.getInfo(debitCard1));
        System.out.println(bank.checkBalance(debitCard1));
        bank.makePurchase(debitCard1, 100);
        bank.deposit(debitCard1, 432);
        bank.withdrawal(debitCard1, 32);
        bank.deposit(debitCard1, 1000);
        System.out.println(bank.checkBalance(debitCard1));

        LinkedList<Transaction> debitTransactions = bank.getTransactionsHistory(debitCard1);
        System.out.println("Transaction list of Dedit card:");
        for (Transaction transaction : debitTransactions) {
            System.out.println(transaction);
        }

        try {
            CreditCard creditCard1 = bank.createCreditCard(account1);
            System.out.println(bank.getInfo(creditCard1));
            System.out.println(bank.checkBalance(creditCard1));
            bank.makePurchase(creditCard1, 500);
            bank.makePurchase(creditCard1, 76);
            bank.makePurchase(creditCard1, 43);
            bank.makePurchase(creditCard1, 105);
            bank.checkMinPayment(creditCard1);

            LinkedList<Transaction> creditTransactions = bank.getTransactionsHistory(creditCard1);
            System.out.println("\nTransaction list of Credit card:");
            for (Transaction transaction : creditTransactions) {
                System.out.println(transaction);
            }
        } catch (WithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
