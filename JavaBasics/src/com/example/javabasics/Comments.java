package com.example.javabasics;

/**
 * this comment is commonly used in documenting classes and methods
 * this class demonstrates the difference between single line and multi line comments
 */
public class Comments {
    public static void main(String[] args) {
        /*
        this is a multi line comment
        */
        final int FIRSTNUMBER = 11;
        int secondNumber = 20;
        // this is a single line comment
        double average = (FIRSTNUMBER + secondNumber) / 2.0;
        // the above is similar to :
        // average = (double)(firstNumber + secondNumber) / 2;
        System.out.printf("Average is %f\n", average);
        System.out.printf("Average is "+ average + '\n');
    }
}
