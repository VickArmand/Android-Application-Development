package com.example.javabasics;

public class Highest_and_Lowest_in_Arrays_v1 {
    public static void main(String[] args) {
        int [] arr1 = {2,6,10,12,15,17,8,1};
        int highest = arr1[0], lowest = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > highest) {
                highest = arr1[i];
            }
            if (arr1[i] < lowest) {
                lowest = arr1[i];
            }
        }
        System.out.println("Highest is "+ highest);
        System.out.println("Lowest is "+ lowest);
    }
}
