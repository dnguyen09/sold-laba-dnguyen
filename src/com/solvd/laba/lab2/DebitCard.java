package com.solvd.laba.lab2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DebitCard extends Account{
    /*declare properties*/
    private long cardNumber;
    private String expirationDate;
    private int cvv;
    private int pin;

    /*constructor*/
    public DebitCard(Account account, String accountType, int pin) {
        super(account.getCustomer(), account.getBalance());
        this.setAccountNumber(account.getAccountNumber());
        this.cardNumber = generateNumber();
        this.expirationDate = generateExpirationDate();
        this.cvv = generateCVV();
        this.pin = pin;
        this.setAccountType(accountType);
    }

    /*Getters and Setters*/
    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /*methods*/
    @Override
    public long generateNumber() {
        String idCredit = "6677";
        Random random = new Random();
        int randCredit = random.nextInt(100000) + 1000;
        //Concat String with lastAccNum to not get same number generated
        String creditCardNum = idCredit + String.valueOf(randCredit) + String.valueOf(lastAccNum);
        lastAccNum++;
        return Long.parseLong(creditCardNum);
    }

    public String generateExpirationDate() {
        Calendar dateNow = Calendar.getInstance();
        dateNow.setTime(new Date());
        dateNow.add(Calendar.YEAR, 3);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
        return dateFormat.format(dateNow.getTime());
    }

    public int generateCVV() {
        try {
            Random random = new Random();
            int cvv = random.nextInt(900) + 100;

            //check if cvv follow format
            if (!isValidCVV(cvv)) {
                throw new CVVException("Invalid cvv: " + cvv);
            }
            return cvv;
        }
        catch (CVVException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    private boolean isValidCVV(int cvv) {
        return cvv >= 100 && cvv <= 999;
    }

    @Override
    public String toString() {
        return ("Name: " + getCustomer().getCustomerName() + "\n" +
                "Debit card number: " + getCardNumber() + "\n" +
                "Expiration date : " + getExpirationDate() + "    " +
                "CVV: " + getCvv() + " \n" + "Pin: " + getPin());
    }

}
