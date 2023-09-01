package com.example.javabasics.JavaandSQLite;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class createDB extends conn{
    private Statement stmt;
    private Connection c;
    protected createDB() throws SQLException {
        try
        {
            c = conn();
            stmt = c.createStatement();
            String create = "CREATE TABLE IF NOT EXISTS posts (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, title CHAR(50) NOT NULL, slug CHAR(50) NOT NULL, body TEXT NOT NULL)";
            stmt.executeUpdate(create);
            System.out.println("Table created successfully");
        }
        catch(Exception ex)
        {
            System.out.println("Error creating table: "+ ex);
            System.exit(0);
        }
        stmt.close();
        c.close();
    }
}