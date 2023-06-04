package com.example.javabasics;

import javax.swing.*;

public class Reading_Inputs_Using_JOptionPane {
    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("Please enter your first name");
        String surName = JOptionPane.showInputDialog("Please enter your surname");
        String message = "Hello "+ firstName +" "+surName +" welcome to Java programming";
        JOptionPane.showMessageDialog(null, message);

        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        int sum = firstNumber + secondNumber;
        message = "Sum of"+ firstNumber +" and "+secondNumber +" is "+ sum;
        JOptionPane.showMessageDialog(null, message);

    }
}