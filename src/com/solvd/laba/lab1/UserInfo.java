package com.solvd.laba.lab1;

public class UserInfo {
    public static void main(String[] args) {
        //check if args array has argument
        if (args.length > 0) {
            //assign name
            String name = args[0];

            //print out name
            System.out.println("Name: " + name);
        }
        else {
            System.out.println("No name provided.");
        }
    }
}
