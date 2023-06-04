package com.example.javabasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arrays_and_File_Handling {
    public static void main(String[] args) throws FileNotFoundException {

        String pathname = "Values.txt";
        int [] values = readFile(pathname);
        for (int value : values) {
            System.out.println(value);
        }

    }

    /**
     * this function reads integer values in a file and saves them in an array
     * @param pathname - pathname of the file containing integer values
     * @return - an integer array
     * @throws FileNotFoundException - in case pathname is not found an error is thrown
     */
    public static int[] readFile(String pathname) throws FileNotFoundException {
        File file = new File(pathname);
        int [] values = new int [10];
        int i = 0;
        if (file.exists()) {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext() && i < values.length) {
                values[i] = inputFile.nextInt();
                i++;
            }
            inputFile.close();
        }
        return values;
    }

}
