package com.solvd.laba.lab2;

public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer("John","12-15-2014",700);
        Customer cus2 = new Customer("Doe","11-22-1979", 660);

        CreditCheck checkCustomer = new CreditCheck();

        checkCustomer.isQualifyAcc(cus1);
        checkCustomer.isQualifyAcc(cus2);

        Account acc1 = new Account(1112223,300,"checking account",cus2);
        CheckingAccount check1 = new CheckingAccount(acc1, 12.0);

        System.out.println("Account number: " + check1.getAccountNumber());
        System.out.println("Checking account balance: " + check1.getBalance());

        check1.chargeMonthlyFee();
        System.out.println("Balance after monthly fee: " + check1.getBalance());
        check1.deposit(300);
        System.out.println("Balance after deposit $200: " + check1.getBalance());
        check1.chargeMonthlyFee();

        SavingAccount sav1 = new SavingAccount(acc1, "Saving account",1500,0.15);
        System.out.println("Saving account balance: " + sav1.getBalance());
        System.out.println("Interest Earned: " + "$" + sav1.getInterestEarned());











    }
}
