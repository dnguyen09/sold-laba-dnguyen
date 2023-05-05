package com.solvd.laba.lab2;

import com.solvd.laba.lab2.exception.CreditCheckException;
import com.solvd.laba.lab2.exception.WithdrawalException;
import com.solvd.laba.lab2.linkedList.LinkedListCustom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws WithdrawalException {

        Bank bank = new Bank("Chase", "Irvine, WY");
        Customer cus1 = new Customer("John", "12-15-1991", 570);
        Customer cus2 = new Customer("Doe", "11-22-1979", 660);

        try {
            String result1 = bank.makeCreditCheck(cus1);
            logger.info(result1);
            String result2 = bank.makeCreditCheck(cus2);
            logger.info(result2);
        } catch (CreditCheckException e) {
            logger.info("Error while processing credit check for customer " + e.getMessage());
        }


        Account account1 = bank.createAccount(cus1, 400);
        logger.info("Account number: " + bank.getAccountNumber(account1) + "\n");
        Account account2 = bank.createAccount(cus2, 4000);
        logger.info("Account number: " + bank.getAccountNumber(account2));
        System.out.println();

        CheckingAccount check1 = bank.createCheckingAccount(account1);
        logger.info("Checking number: " + bank.getAccountNumber(check1));
        CheckingAccount check2 = bank.createCheckingAccount(account2);
        logger.info("Checking number: " + bank.getAccountNumber(check2) + "\n");


        bank.checkMonthlyFee(check1);
        bank.deposit(check1, 1000);
        logger.info(bank.checkBalance(check1));
        bank.checkMonthlyFee(check1);

        SavingAccount save1 = bank.createSavingAccount(account1, 0, 0.15);
        logger.info("Saving number: " + bank.getAccountNumber(save1));
        logger.info(bank.checkBalance(save1));
        bank.checkInterestRate(save1);
        bank.deposit(save1, 2000);
        logger.info(bank.checkBalance(save1));
        bank.checkInterestRate(save1);

        DebitCard debitCard1 = bank.createDebitCard(check1);
        logger.info(bank.getInfo(debitCard1));
        logger.info(bank.checkBalance(debitCard1));
        bank.makePurchase(debitCard1, 100);
        bank.deposit(debitCard1, 432);
        bank.withdrawal(debitCard1, 32);
        bank.deposit(debitCard1, 1000);
        logger.info(bank.checkBalance(debitCard1));

        LinkedListCustom<Transaction> debitTransactions = bank.getTransactionsHistory(debitCard1);
        logger.info("Transaction list of Dedit card:");
        for (int i = 0; i < debitTransactions.getSize(); i++) {
            Transaction transaction = debitTransactions.get(i);
            logger.info(transaction);
        }
        System.out.println();


        CreditCard creditCard1 = bank.createCreditCard(account1);
        logger.info(bank.getInfo(creditCard1));
        logger.info(bank.checkBalance(creditCard1));
        bank.makePurchase(creditCard1, 500);
        bank.makePurchase(creditCard1, 76);
        bank.makePurchase(creditCard1, 43);
        bank.makePurchase(creditCard1, 105);
        bank.checkMinPayment(creditCard1);

        LinkedListCustom<Transaction> creditTransactions = bank.getTransactionsHistory(creditCard1);
        logger.info("\nTransaction list of Credit card:");
        for (int i = 0; i < creditTransactions.getSize(); i++) {
            Transaction transaction = debitTransactions.get(i);
            logger.info(transaction);
        }
    }
}
