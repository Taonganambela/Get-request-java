package com.zmltd.spring1.controller;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name");

        String userName = myObj.nextLine();
        System.out.println("Your name is: " + userName);

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("How old are you");

        String userAge = myObj2.nextLine();
        System.out.println("Your name is: " + userAge);

        System.out.println("You are " + userName + ", You are " + userAge + " years old");
        myObj.close();
    }

}
