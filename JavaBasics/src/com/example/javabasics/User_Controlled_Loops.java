package com.example.javabasics;

import javax.swing.*;

public class User_Controlled_Loops {
    public static void main(String[] args) {
        int maxValue = Integer.parseInt(JOptionPane.showInputDialog("Please enter the maximum value where the square should peak"));
        System.out.println("Number       Number Squared");
        System.out.println("---------------------------");
        for (int i = 1; i <= maxValue; i++)
        {
            System.out.printf("%d\t\t\t\t%d\n", i, i*i);
        }
    }
}
