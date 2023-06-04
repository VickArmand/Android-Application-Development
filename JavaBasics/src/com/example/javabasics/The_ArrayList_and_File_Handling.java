package com.example.javabasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java arrays are of fixed size when initialized
 * hence they cannot grow or shrink
 * but arraylists are created with an initial size and
 * when the size is exceeded(adding values) it is automatically enlarged
 * and when objects are removed they shrink
 */
public class The_ArrayList_and_File_Handling {
    public static void main(String[] args) throws FileNotFoundException {
        String pathname = "Values.txt";
        ArrayList <Integer> values = readFile(pathname);
        System.out.println(values);
    }

    /**
     * this function reads file containing integers and stores the integers in an arraylist and returns it
     * @param pathname - pathname of the file containing integer values
     * @return - arraylist containing integer values
     * @throws FileNotFoundException - in case pathname is not found an error is thrown
     */
    public static ArrayList<Integer> readFile(String pathname) throws FileNotFoundException {
        ArrayList <Integer> values = new ArrayList<>();
        File file = new File(pathname);
        if (file.exists())
        {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()){
                values.add(fileScanner.nextInt()); // adding each integer in the file into the arraylist
            }
        }
        return values;
    }
}
