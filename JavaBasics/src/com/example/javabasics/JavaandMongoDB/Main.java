package com.example.javabasics.JavaandMongoDB;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        DBConnect db = new DBConnect();
        DBCollection coll = new DBCollection();
        coll.Collectioncreate();
        JOptionPane.showMessageDialog(null,coll.CollectionSelect());
    }
}
