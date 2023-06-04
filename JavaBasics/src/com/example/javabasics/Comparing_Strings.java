package com.example.javabasics;

import javax.swing.*;

public class Comparing_Strings {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Please enter a name");
        String name2 = JOptionPane.showInputDialog("Please enter another name");
        if (name1.equals(name2))
            JOptionPane.showMessageDialog(null,"Both names entered are equal");
        else
            JOptionPane.showMessageDialog(null,"Both names entered aren't equal");
        if (name1.compareTo(name2) == 0)
            JOptionPane.showMessageDialog(null,"Both names entered are equal");
        else if (name1.compareTo(name2) < 0)
            JOptionPane.showMessageDialog(null,name1+ " is first while"+ name2 +"is second alphabetically");
        else if (name1.compareTo(name2) > 0)
            JOptionPane.showMessageDialog(null,name1 +" is second while" + name2 + " is first alphabetically");
//        using the same concept but with string literals will behave differently
        String newname1 = "Peter";
        String newname2 = "Peter";
        if (newname1 == newname2)
            JOptionPane.showMessageDialog(null,"Both names entered are equal");
        else
            JOptionPane.showMessageDialog(null,"Both names entered aren't equal");
        System.exit(0);
    }
}

