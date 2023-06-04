package com.example.javabasics;

public class Arrays {
    public static void main(String[] args) {
        int [] numbers = new int [4];
        // can also be int numbers [] = new int [4];
        // or int numbers [] = {14,12,10,8};
        numbers[0] = 12;
        numbers[0] = 14;
        numbers[1] = 12;
        numbers[2] = 10;
        numbers[3] = 8;
        // in arrays one cannot change the size after declaration
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
        // the above loop is similar to using the enhanced for loop below
        for(int element : numbers)
            System.out.println(element);
    }
}
