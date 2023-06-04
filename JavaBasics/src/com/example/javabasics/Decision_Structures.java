package com.example.javabasics;

public class Decision_Structures {
    public static void main(String[] args) {
        int x = 5, y = 6, z = 7;
        boolean expr = x == y;
        System.out.println(expr);
        System.out.println(x < z);
        System.out.println(x > y && y < z);
        System.out.println(x > y || y < z);
        System.out.println(x > y || y > z);
        System.out.println(!(x < y) && y > z);
        System.out.println(!(x > y) && !(y > z));
        System.out.println(expr || y == z);
        System.out.println(!(expr) && !(y == z));


    }
}
