package com.solvd.laba.lab2;

import java.util.List;

public class Bank {
    /*declare properties*/
    private String name;
    private List<Account> accounts;

    /*constructor*/
    public Bank (String name) {
        this.name = name;
    }

    public Bank() {
        this("");
    }

    /*getter and setter*/
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    };

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    /*methods*/
    public void addAccount(Account account) {
        this.accounts.add(account);
    }


}
