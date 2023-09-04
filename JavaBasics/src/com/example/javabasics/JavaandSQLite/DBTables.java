package com.example.javabasics.JavaandSQLite;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTables extends conn{
    private Statement stmt;
    private Connection c;
    protected void createTables() throws SQLException {
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
    protected void dropTables() throws SQLException {
        try
        {
            c = conn();
            stmt = c.createStatement();
            String drop = "DROP TABLE IF EXISTS posts";
            stmt.executeUpdate(drop);
            System.out.println("Table dropped successfully");
        }
        catch(Exception ex)
        {
            System.out.println("Error dropping table: "+ ex);
            System.exit(0);
        }
        stmt.close();
        c.close();
    }
}