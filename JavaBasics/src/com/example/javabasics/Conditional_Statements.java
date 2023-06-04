package com.example.javabasics;

import javax.swing.*;

/**
 * this class demonstrates the use of
 * if, if else, if else-if else statements
 * using the fizz buzz challenge
 * whereby numbers divisible by 3 return fizz
 * while numbers divisible by 5 return buzz while
 * numbers divisible by both 5 and 3 return fizz buzz
 */
public class Conditional_Statements {
    public static void main(String[] args) {
        JOptionPane.showOptionDialog(null,"Welcome to the FIZZ BUZZ CHALLENGE click YES to Proceed","FIZZ BUZZ CHALLENGE",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter any number between 0 and 100"));
        if (input < 100 && input >= 0) // for values in a range we use the && operator while for values outside a range we use || operator
        {
            if (input % 15 == 0)
                JOptionPane.showMessageDialog(null, "Fizz Buzz");
            else if (input % 3 == 0)
                JOptionPane.showMessageDialog(null, "Fizz");
            else if (input % 5 == 0)
                JOptionPane.showMessageDialog(null, "Buzz");
            else
                JOptionPane.showMessageDialog(null, "Neither fizz nor buzz nor fizz buzz");
        }
        else {
            JOptionPane.showMessageDialog(null, "Input greater than 100");
        }
        System.exit(0); // used to prevent too much memory load after executing the option pane windows
    }
}
