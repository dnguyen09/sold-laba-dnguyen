package com.solvd.laba.lab2;

public class CreditScore {
    /*declare properties*/
    private int creditScore;

    /*constructors*/
    public CreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public CreditScore() {
        this(0);
    }

    /*Getters and setters*/
    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
