package com.solvd.laba.lab2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Chase", "Irvine, WY");
        Customer cus1 = new Customer("John","12-15-1991",570);
        Customer cus2 = new Customer("Doe","11-22-1979", 660);

        String result1 = bank.makeCreditCheck(cus1);
        System.out.println(result1);

        String result2 = bank.makeCreditCheck(cus2);
        System.out.println(result2);

        Account account1 = bank.createAccount(cus1, 400);
        Account account2 = bank.createAccount(cus2, 4001);
        System.out.println(bank.getAccountNumber(account1));
        System.out.println(bank.getAccountNumber(account2));

        CheckingAccount check1 = bank.createCheckingAccount(account1);
        System.out.println("Checking number acc1: " + bank.getAccountNumber(check1));
        CheckingAccount check2 = bank.createCheckingAccount(account2);
        System.out.println("Checking number acc2 : " + bank.getAccountNumber(check2) + "\n");

        bank.checkMonthlyFee(check1);
        bank.deposit(check1, 1000);
        System.out.println("Balance acc1: " + bank.checkBalance(check1));
        bank.checkMonthlyFee(check1);

        SavingAccount save1 = bank.createSavingAccount(account1, 1000, 0.15);
        System.out.println("Saving number acc1: " + bank.getAccountNumber(save1));
        System.out.println("Saving balance: " + bank.checkBalance(save1));
        bank.checkInterestRate(save1);
        bank.deposit(save1, 2000);
        System.out.println("Saving balance: " + bank.checkBalance(save1));
        bank.checkInterestRate(save1);

    }
}
