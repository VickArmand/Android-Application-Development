package com.example.javabasics;

import javax.swing.*;
import java.util.Scanner;

/**
 * this class demonstrates the use of switch elements in Java programming
 */
public class Switch_Statements {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number from 0 to 6");
        int input = keyboard.nextInt();
        switch (input){
            case 0:
                System.out.println("Day 0 is Sunday");
                break;
            case 1:
                System.out.println("Day 1 is Monday");
                break;
            case 2:
                System.out.println("Day 2 is Tuesday");
                break;
            case 3:
                System.out.println("Day 3 is Wednesday");
                break;
            case 4:
                System.out.println("Day 4 is Thursday");
                break;
            case 5:
                System.out.println("Day 5 is Friday");
                break;
            case 6:
                System.out.println("Day 6 is Saturday");
                break;
            default:
                System.out.println("Invalid Integer value");
        }
        char letter = JOptionPane.showInputDialog(null, "Please enter a letter from a, b and c").charAt(0);
        switch (letter){
            case 'A':
            case 'a':
                JOptionPane.showMessageDialog(null,"Character input is a");
                break;
            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null,"Character input is b");
                break;
            case 'C':
            case 'c':
                JOptionPane.showMessageDialog(null,"Character input is c");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid character value");
        }
        System.exit(0);
    }
}
