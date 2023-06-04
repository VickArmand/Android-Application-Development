package com.example.javabasics;

public class CompareArrays {
    public static void main(String[] args) {
        int[] numbers1 = {2,4,6,8,10};
        int[] numbers2 = {2,4,6,8,10};
        isSameWorst(numbers1,numbers2);
        numbers2 = numbers1; // this now makes numbers2 point to te same object (same address) hence if any array element is changed it will affect both variables
        isSameWorst(numbers1,numbers2);
        /*
        this means that when we use the == we compare the memory addresses just like in strings
        hence it is not the best way to compare 2 different arrays
        the best way to compare arrays is shown in the isSameBest method
         */
        numbers2 = new int[]{2, 4, 6, 8, 10};
        if(isSameBest(numbers1,numbers2))
            System.out.println("Arrays are the same");
        else
            System.out.println("Arrays are not the same");
    }

    /**
     * this function compares two arrays by their memory addresses
     * @param numbers1 - first array
     * @param numbers2 - second array
     */
    public static void isSameWorst(int[] numbers1, int[] numbers2) {
        if(numbers2 == numbers1)
            System.out.println("Arrays are the same");
        else
            System.out.println("Arrays are not the same");
    }

    /**
     * this function compares two arrays by first comparing their length then each individual value
     * @param numbers1 - first int array
     * @param numbers2 - second int array
     * @return a boolean value
     */
    public static boolean isSameBest(int[] numbers1, int[] numbers2) {
        int i = 0;
        boolean arrayIsEqual = true;
        if(numbers2.length == numbers1.length) {
            while (arrayIsEqual && i < numbers1.length) {
                if (numbers1[i] != numbers2[i])
                    arrayIsEqual = false;
                i++;
            }

        }
        else{
            arrayIsEqual = false;
        }
        return arrayIsEqual;
    }

}
