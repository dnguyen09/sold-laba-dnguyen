package com.solvd.laba.lab2;

public class CreditCheck {
    /*method to check if an account qualifies for a credit*/
    public boolean isQualifyAcc(Customer customer) {
        //check credit score
        if (customer.getCreditScore() < 580) {
            System.out.println("Sorry, your account does not qualify \n" +
                    "Your credit score is " + customer.getCreditScore() + "\n" +
                    "Your credit score needs at least 580 to be qualified\n");
            return false;
        }
        //check age
        else if (customer.getAge() < 18) {
            System.out.println("Sorry, your account does not qualify \n" +
                    "Your age is " + customer.getAge() + "\n" +
                    "Your age is at least 18 to be qualified\n");
            return false;
        } else {
            System.out.println("Congratulation! You are qualified for credit\n");
            return true;
        }
    }
}
