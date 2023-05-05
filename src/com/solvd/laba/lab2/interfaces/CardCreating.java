package com.solvd.laba.lab2;

public interface CardCreating {
    String generateExpirationDate();
    int generateCVV();
    boolean isValidCVV(int cvv);

}

