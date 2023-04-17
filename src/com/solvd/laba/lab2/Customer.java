package com.solvd.laba.lab2;

public class Customer {
    /*declare properties*/
    private String customerName;
    private int customerAge;

    /*constructors*/
    public Customer(String customerName, int customerAge) {
        this.customerName = customerName;
        this.customerAge = customerAge;
    }

    public Customer() {
        this("",0);
    }

    /*Getters and setters*/
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }
}
