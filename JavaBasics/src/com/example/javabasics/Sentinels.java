package com.example.javabasics;

import javax.swing.*;

/**
 * sentinels are input values used to terminate loops
 */
public class Sentinels {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number to be squared and enter 0 to stop"));
        while (input != 0)
        {
            JOptionPane.showMessageDialog(null, input+ " squared is "+ input*input);
            input = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number to be squared and enter 0 to stop"));
        }
        System.exit(0);
    }
}
