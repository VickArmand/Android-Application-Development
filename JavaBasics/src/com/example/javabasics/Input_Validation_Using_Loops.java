package com.example.javabasics;

import javax.swing.*;

public class Input_Validation_Using_Loops {
    public static void main(String[] args) {
        int numinput = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number in the range of 1 to 100"));
        while (numinput < 1 || numinput > 100) // this loop stops if the user input is between 0 and 101
        {
            JOptionPane.showMessageDialog(null, "Invalid number");
            numinput = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number in the range of 1 to 100"));

        }
        JOptionPane.showMessageDialog(null, "Valid number");
        System.exit(0);
    }
}
