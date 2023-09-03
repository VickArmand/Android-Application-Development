package com.example.postsappwithsqlite;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB extends Connect{
    private Statement stmt;
    private String create = "CREATE TABLE posts (id PRIMARY KEY AUTOINCREMENT NOT NULL, title CHAR(50) NOT NULL, slug CHAR(50) NOT NULL, body TEXT NOT NULL)";
    private Connection c;
    protected void createDB() throws SQLException {
        try
        {
            c = Connect();
            stmt = c.createStatement();
            stmt.executeQuery(create);
            stmt.close();
            c.close();
            System.out.println("Table created successfully");
        }
        catch(Exception ex)
        {
            System.out.println("Error creating table: "+ ex);
            System.exit(0);
        }
    }
}
