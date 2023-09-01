package com.example.javabasics.JavaandSQLite;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Objects;

public class crud extends conn{
    private Statement stmt;
    private StringBuilder query = new StringBuilder();
    private final Connection c = conn();
    private HashMap data = new HashMap<String, String>();
    private final String tableName = "posts";
    private final String[] columns = {"id", "title", "slug", "body"};
    private ResultSet rs;
    public crud() throws SQLException {
    }

    protected void create(HashMap data) throws SQLException {
        int i = 1;
        this.query = new StringBuilder("INSERT INTO " + this.tableName + " (");
        StringBuilder subquery = new StringBuilder(" VALUES (");
        if (data == null)
        {
            System.out.println("Invalid input");
        }
        while (i < columns.length)
        {
            if (data.get(columns[i]) == null || data.get(columns[i]).toString().length() == 0) {
                System.out.println("Null input not allowed for "+columns[i]);
                break;
            }
            if (i == columns.length - 1) {
                this.query.append(columns[i]);
                subquery.append("'").append(Objects.requireNonNull(data).get(columns[i])).append("'");
            }
            else {
                this.query.append(columns[i]).append(",");
                subquery.append("'").append(Objects.requireNonNull(data).get(columns[i])).append("'").append(",");
            }
            i++;
        }
        this.query.append(")");
        subquery.append(");");
        this.query .append(subquery);
        try {
            stmt = this.c.createStatement();
            stmt.executeUpdate(String.valueOf(this.query));
            stmt.close();
            this.c.commit();
        } catch (Exception ex) {
            if (c != null)
                c.setAutoCommit(false);
            else {
                System.out.println("Error inserting record: " + ex);
                System.exit(0);
            }
        }
    }
    protected void read() throws SQLException {
        this.query = new StringBuilder("SELECT * FROM " + this.tableName);
        try
        {
            int i;
            stmt = this.c.createStatement();
            this.rs = stmt.executeQuery(String.valueOf(this.query));
            while (rs.next())
            {
                i = 0;
                while (i < columns.length)
                {

                    this.data.put(this.columns[i], rs.getString(this.columns[i]));
                    i++;
                }
                System.out.println(this.data);
            }
        }
        catch (Exception ex)
        {
            if (c != null)
                c.setAutoCommit(false);
            else {
                System.out.println("Error reading records: " + ex);
                System.exit(0);
            }
        }
        finally {
            rs.close();
            stmt.close();
        }
    }
    protected HashMap find(int id) throws SQLException {
        query = new StringBuilder("SELECT * FROM " + this.tableName + " WHERE " + columns[0] + "= " + id);
        try
        {
            int i;
            stmt = this.c.createStatement();
            this.rs = stmt.executeQuery(String.valueOf(this.query));
            while (rs.next())
            {
                i = 0;
                while (i < columns.length)
                {
                    this.data.put(this.columns[i], rs.getString(this.columns[i]));
                    i++;
                }
            }
        }
        catch (Exception ex)
        {
            if (c != null)
                c.setAutoCommit(false);
            else {
                System.out.println("Error reading record: " + ex);
                System.exit(0);
            }
        }
        finally {
            rs.close();
            stmt.close();
        }
        return (data);
    }
    protected void update(int id, HashMap data) throws SQLException {
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
            this.query = new StringBuilder("UPDATE " + this.tableName + " SET ");
            while (i < columns.length)
            {
                if (data.get(columns[i]) == null || data.get(columns[i]).toString().length() == 0) {
                    data.put(columns[i], existing_data.get(columns[i]));
                }
                if (i == columns.length - 1)
                    this.query.append(columns[i]).append("= '").append(data.get(columns[i])).append("'");
                else
                    this.query.append(columns[i]).append("= '").append(data.get(columns[i])).append("'").append(",");
                i++;
            }
            this.query.append(" WHERE ").append(columns[0]).append("=").append(id);
            try {
                stmt = this.c.createStatement();
                stmt.executeUpdate(String.valueOf(this.query));
                stmt.close();
                this.c.commit();
                c.setAutoCommit(false);
            } catch (Exception ex) {
                if (c != null)
                    c.setAutoCommit(false);
                else {
                    System.out.println("Error updating record: " + ex);
                    System.exit(0);
                }
            }
        }
    }
    protected void delete(int id) throws SQLException {
        HashMap existing_data = find(id);
        this.query = new StringBuilder("DELETE FROM " + this.tableName + " WHERE " + this.columns[0] + " = " + id);
        if (existing_data.size() == 0)
        {
            System.out.println("Record not found");
        }
        else {
            try {
                stmt = this.c.createStatement();
                stmt.executeUpdate(String.valueOf(this.query));
                this.c.commit();
                c.setAutoCommit(false);
            } catch (Exception ex) {
                if (c != null) {
                    c.setAutoCommit(false);
                }
                else {
                    System.out.println("Error deleting record: " + ex);
                    System.exit(0);
                }
            } finally {
                stmt.close();
            }
        }
    }

}
