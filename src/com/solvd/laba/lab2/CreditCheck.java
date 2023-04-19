package com.solvd.laba.lab2;

public class CreditCheck {
    /*method to check if an account qualifies for a credit*/
    public boolean isQualifyAcc(Account account, Customer customer) {
        //Check balance
            if (account.getBalance() < 700) {
                return false;
            }
            //check credit score
            else if (customer.getCreditScore() < 580) {
                return false;
            }
            //check age
            else if (customer.getAge() < 18) {
                return false;
            }
            else {
                return true;
            }
    }

    /*method to print messages*/
    public void printMessage(Account account, Customer customer) {
        if ((isQualifyAcc(account, customer))) {
            System.out.println("Congratulation! you qualify for this account");
        } else {
            System.out.println("Sorry, your account does not qualify");
        }
    }
}
