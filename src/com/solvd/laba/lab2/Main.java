package com.solvd.laba.lab2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Chase", "Irvine, WY");
        Customer cus1 = new Customer("John","12-15-2014",770);
        Customer cus2 = new Customer("Doe","11-22-1979", 660);

        String result1 = bank.makeCreditCheck(cus1);
        System.out.println(result1);

        String result2 = bank.makeCreditCheck(cus2);
        System.out.println(result2);

        Account account1 = bank.createAccount(cus1, 400);
        System.out.println(account1.getAccountNumber());

        CheckingAccount check1 = bank.createCheckingAccount(account1);
        System.out.println(check1.getAccountNumber());
        bank.checkMonthlyFee(check1);
        bank.depositCheckingAcc(check1, 1000);
        System.out.println(check1.getBalance());
        bank.checkMonthlyFee(check1);


//        SavingAccount sav1 = new SavingAccount(acc1, "Saving account",1500,0.15);
//        System.out.println("Saving account balance: " + sav1.getBalance());
//        System.out.println("Interest Earned: " + "$" + sav1.getInterestEarned());
    }
}
