package com.example.javabasics;

public class Highest_and_Lowest_in_Arrays_v2 {
    public static void main(String[] args) {
        int[] array1 = {4,10,12,8,2,6};
        sortArray(array1);
        System.out.println("Minimum element is "+ array1[0]);
        System.out.println("Maximum element is "+ array1[array1.length - 1]);
    }

    /**
     * this function sorts the array using bubble sort algorithm to enable easy identification of max and min
     * @param array1 - array with integer elements
     * @return - the sorted array
     */
    public static int[] sortArray(int [] array1)
    {
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < (array1.length - i - 1); j++) {
                if (array1[j] > array1[j + 1])
                {
                    swapElements(j, j + 1, array1);
                }
            }
        }
        return array1;
    }

    /**
     * this function swaps array elements and is called when one of the two adjacent array elements is larger than the other
     * @param index1 - first array index
     * @param index2 - second array index
     * @param array - array whose elements will be swapped
     */
    public static void swapElements(int index1, int index2,int [] array)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
