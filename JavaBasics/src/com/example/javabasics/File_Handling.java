package com.example.javabasics;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) throws IOException {
        String pathname = "OutputFile.txt";
        File_Handling fh = new File_Handling();
        fh.createFile(pathname);
        JOptionPane.showMessageDialog(null,fh.readFile(pathname));
        String pathname2 = "OutputFile2.txt";
        fh.createIntFile(pathname2);
        JOptionPane.showMessageDialog(null, fh.calculateAverage(pathname2));
    }

    /**
     * this function creates a file and adds contents into the new file
     * @param pathname - pathname of the file to be created
     * @throws FileNotFoundException - in case pathname is not found an error is thrown
     */
    public void createFile (String pathname) throws FileNotFoundException {
        // create and open file
        // if file exists it will replace
        PrintWriter outputFile = new PrintWriter(pathname);
        outputFile.println("This is line one"); // Adding a new line
        outputFile.println("This is line two"); // Adding a new line
        outputFile.close();
    }

    /**
     * this function creates a file and adds integers into the new file
     * @param pathname - pathname of the file to be created. This file will contain integer values only
     * @throws FileNotFoundException - in case pathname is not found an error is thrown
     */
    public void createIntFile (String pathname) throws FileNotFoundException {
        // create and open file
        // if file exists it will replace
        PrintWriter outputFile = new PrintWriter(pathname);
        outputFile.println(88); // Adding a new line
        outputFile.println(66); // Adding a new line
        outputFile.println(74);
        outputFile.println(50);
        outputFile.close();
    }

    /**
     * this function reads a file and stores file contents into a string builder
     * @param pathname - pathname of the file to be read
     * @return - string containing file contents
     * @throws FileNotFoundException - in case pathname is not found an error is thrown
     */
    public String readFile (String pathname) throws FileNotFoundException {
        StringBuilder message = new StringBuilder();
        File file = new File(pathname);
        if(file.exists()) {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                message.append(inputFile.nextLine()).append('\n');
            }
            inputFile.close();
        }
        else
            message = new StringBuilder("File doesn't exist");
        return message.toString();
    }

    /**
     * this function reads integer values in a file and obtains the sum and average of the values
     * @param pathname - pathname of the file to be read
     * @return - a string containing sum and average of integers in te file
     * @throws FileNotFoundException - in case pathname is not found an error is thrown
     */
    public String calculateAverage(String pathname) throws FileNotFoundException {
        int sum = 0, count = 0;
        double average;
        String message;
        File file = new File(pathname);
        if(file.exists()) {
                Scanner inputFile = new Scanner(file);
                while (inputFile.hasNext()) {
                    sum += inputFile.nextInt();
                    count++;
                }
                inputFile.close();
                average = sum / (double)count;
                message = "Sum is "+sum+"\nNumber of values is "+ count+"\nAverage is "+average+"\n";
            }
        else {
            message = "File doesn't exist";
        }
        return message;
    }

}
