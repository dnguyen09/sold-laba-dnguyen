package com.solvd.laba.lab2;

public class CreditScore {
    /*declare properties*/
    private int score;

    /*constructors*/
    public CreditScore(int creditScore) {
        this.score = creditScore;
    }

    public CreditScore() {
        this(0);
    }

    /*Getters and setters*/
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
