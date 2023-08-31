package com.example.javabasics.JavaandSQLite;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class crud extends conn{
    private Statement stmt;
    private String query;
    private final Connection c = conn();
    private HashMap data;
    private final String tableName = "posts";
    private final String[] columns = {"id", "title", "slug", "body"};
    private ResultSet rs;

    public crud() throws SQLException {
    }

    protected void create(HashMap data)
    {
        int i = 1;
        this.query = "INSERT INTO" + this.tableName +"(";
        String subquery = "VALUES (";
        if (data == null)
        {
            System.out.println("Invalid input");
        }
        while (i < columns.length)
        {
            if (i == columns.length - 1) {
                this.query += columns[i];
                subquery += data.get(columns[i]);
            }
            else {
                this.query += columns[i] + ",";
                subquery += data.get(columns[i]) + ",";
            }
            i++;
        }
        this.query += ")";
        subquery += ");";
        this.query += subquery;
        try {
            stmt = this.c.createStatement();
            stmt.executeUpdate(this.query);
            this.c.commit();
            stmt.close();
        } catch (Exception ex) {
            System.out.println("Error updating record: "+ ex);
            System.exit(0);
        }
    }
    protected HashMap read()
    {
        this.data = null;
        this.query = "SELECT * FROM "+this.tableName;
        try
        {
            int i;
            stmt = this.c.createStatement();
            this.rs = stmt.executeQuery(this.query);
            while (rs.next())
            {
                i = 0;
                while (i < columns.length)
                {
                    this.data.put(this.columns[i], rs.getString(this.columns[i]));
                    i++;
                }
            }
            rs.close();
            stmt.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error reading records: "+ ex);
            System.exit(0);
        }
        return (this.data);
    }
    protected HashMap find(int id)
    {
        data = null;
        query = "SELECT * FROM "+this.tableName+" WHERE"+columns[0]+"="+id;
        try
        {
            int i;
            stmt = this.c.createStatement();
            this.rs = stmt.executeQuery(this.query);
            while (rs.next())
            {
                i = 0;
                while (i < columns.length)
                {
                    this.data.put(this.columns[i], rs.getString(this.columns[i]));
                    i++;
                }
            }
            rs.close();
            stmt.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error reading records: "+ ex);
            System.exit(0);
        }
        return (data);
    }
    protected void update(int id, HashMap data)
    {
        data = null;
        HashMap existing_data = find(id);
        if (existing_data == null)
        {
            System.out.println("Record not found");
        }
        else if (data == null)
        {
            System.out.println("Invalid input");
        }
        else {
            int i = 1;
            this.query = "UPDATE " + this.tableName + " SET";
            while (i < columns.length)
            {
                if (data.get(columns[i]) == null) {
                    data.put(columns[i], existing_data.get(columns[i]));
                }
                if (i == columns.length - 1)
                    this.query += columns[i]+"="+data.get(columns[i]);
                else
                    this.query += columns[i]+"="+data.get(columns[i])+ ",";
                i++;
            }
            this.query += "WHERE "+columns[0]+"=" +id;
            try {
                stmt = this.c.createStatement();
                stmt.executeUpdate(this.query);
                this.c.commit();
                stmt.close();
            } catch (Exception ex) {
                System.out.println("Error updating record: "+ ex);
                System.exit(0);
            }
        }
    }
    protected void delete(int id)
    {
        query = "DELETE * FROM "+this.tableName+"WHERE "+this.columns[0]+"="+id;
        HashMap existing_data = find(id);
        if (existing_data == null)
        {
            System.out.println("Record not found");
        }
        try
        {
            stmt = this.c.createStatement();
            stmt.executeUpdate(this.query);
            this.c.commit();
            stmt.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error deleting record: "+ ex);
            System.exit(0);
        }
    }
}
