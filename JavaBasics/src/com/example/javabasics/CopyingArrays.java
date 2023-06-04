package com.example.javabasics;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] array1 = {2,4,6,8,10};
        int [] array2 = new int [array1.length]; // currently the values in array2 are {0,0,0,0,0}
        printArray(array2);
        /*
         when copying each element iteratively into another array,
         if we modify a single element of one array the other array won't be affected
         hence this is the best way to copy arrays
         */
        copyArray(array1,array2);
        array2[1] = 5;
        printArray(array1);
        printArray(array2);
        /*
         when pointing an array to the same object using the = operator,
         if we modify a single element of one array the other array will be affected
         */
        array2 = array1;
        array2[1] = 5;
        printArray(array1);
        printArray(array2);
    }

    /**
     * this function prints each element in an array
     * @param arr - array whose elements will be printed
     */
    public static void printArray(int [] arr)
    {
        for (int value : arr)
            System.out.println(value);
        System.out.println();
    }

    /**
     * this function copies the values of one array into another array
     * @param array1 - first array (source array)
     * @param array2 - second array (destination array where values are copied to)
     */
    public static void copyArray(int [] array1, int [] array2){
        for (int i = 0; i < array1.length; i++)
            array2 [i] = array1[i];
    }
}
