package com.solvd.laba.lab2;

public class Bank {
    //declare properties
    private String name;
    private String location;

    //constructor
    public Bank (String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Bank() {
        this("","");
    }

    //getter and setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
