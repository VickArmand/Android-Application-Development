package com.example.javabasics;

/**
 * this class demonstrates the use of loops in Java
 */
public class Loops_syntax {
    public static void main(String[] args) {
        int x = 0; // loop control variable
        while(x < 5)
        {
            System.out.println("Hello world " + x);
            x++; // similar to x = x + 1; or x += 1;
        }
        System.out.println("");
        // while loops are pre-test loops since the statement execution is done after condition test is true
        do {
            System.out.println("HEllo world " + x);
            x++;
        }while (x < 10);
        System.out.println("");
//        do - while loops are post-test loops since the condition test is done after the statement execution
        for (x = 0; x < 5; x++)
        {
            System.out.println("Hello world " + x);
        }
        // for loops are pre-test loops
    }
}