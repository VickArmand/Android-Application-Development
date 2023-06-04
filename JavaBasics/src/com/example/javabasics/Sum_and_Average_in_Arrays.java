package com.example.javabasics;

public class Sum_and_Average_in_Arrays {
    public static void main(String[] args) {
        int[] array1 = {4,10,12,8,2,6};
        int sum = sumElements(array1);
        System.out.println("Sum of all elements is "+ sum);
        System.out.println("Average is "+(double)sum / array1.length);
    }

    /**
     * this function calculates sum of all array elements
     * @param array - array to be used
     * @return - sum
     */
    public static int sumElements(int [] array)
    {
        int sum = 0;
        for (int value : array)
            sum += value;
        return sum;
    }
}
