package com.example.javabasics;

import java.util.Scanner;

public class Reading_Inputs_Using_Scanner_Class {
    public static void main(String[] args) {
//        creating a new scanner object
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNum = keyboard.nextInt();
        System.out.println("Please enter the second number");
        int secondNum = keyboard.nextInt();
        int sum = firstNum + secondNum;
        System.out.printf("Sum of %d and %d is %d\n", firstNum, secondNum, sum);

        keyboard.nextLine();
        System.out.println("Please enter your first name");
        String firstName = keyboard.nextLine();
        System.out.println("Please enter your surname");
        String surName = keyboard.nextLine();
        System.out.printf("Hello %s %s welcome to Java programming", firstName, surName);

    }
}