/*
 * demonstrating the various Java data types such as char, String, int, float,double, boolean
 * */
package com.example.javabasics;

public class Variables_Literals_Constants {
    public static void main (String [] args){
//        Constants - their values never change and they are defined using the final keyword
//        For program readability all Constant variable names should be in caps
        final int FIRSTNUMBER = 11;
        int secondNumber = 20;
        double average = (FIRSTNUMBER + secondNumber) / 2.0;
//        the above is similar to :
//        average = (double)(firstNumber + secondNumber) / 2;
        System.out.printf("Average is %f\n", average);
        System.out.printf("Average is "+ average + '\n');

        String firstName = "John";
        String surName = "Rambo";
        System.out.printf("Full name is %s %s\n", firstName, surName);
        System.out.printf("Full name is " + firstName + " " + surName+ '\n');

        boolean flag = false;
        System.out.println("Flag is set to "+ flag);

        char letter = 97;
//        character can be represented as integers
        System.out.println(letter +" is numerically represented in the ASCII table as "+ (int)letter);
        for (letter = 'a'; letter <= 'z'; letter++)
        {
            System.out.println(letter + " is numerically represented in the ASCII table as "+ (int)letter);
        }
// String literals are variables that have fixed values and cant be changed

    }
}
