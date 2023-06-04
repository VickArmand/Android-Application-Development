package com.example.javabasics;

/**
 * this class demonstrates the use of methods
 * types of methods include void methods and value returning methods
 * void methods perform tasks then terminate
 * value-returning methods perform tasks and sends a value back to the code that called it
 */
public class Methods {
    public static void main(String[] args) {
        //void method
        System.out.println("Hello and welcome to Java programming!");
        // value returning method
        int number = Integer.parseInt("700");
        System.out.println(fibonacci(5));
    }

    /**
     * This method returns a fibonacci of am integer value
     * @param a - An integer value
     * @return - returns the fibonacci result of the integer a
     */
    public static int fibonacci(int a)
    {
        if (a == 0)
            return 1;
        else
            return a * fibonacci(a - 1);
    }
}
