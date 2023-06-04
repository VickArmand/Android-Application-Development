package com.example.javabasics;

import javax.swing.*;
import java.text.DecimalFormat;

public class Totals_Using_Loops {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales = 0;
        DecimalFormat dollar = new DecimalFormat("#,##0.00"); // used to format the total sales to always 2 decimal places
        days = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of days that you have sales"));
        for (int count = 1; count <= days; count++)
        {
            sales = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the sales for day "+ count));
            totalSales += sales;
        }
        JOptionPane.showMessageDialog(null,"Total sales for "+days+" days is $"+dollar.format(totalSales));
        System.exit(0);
    }
}
