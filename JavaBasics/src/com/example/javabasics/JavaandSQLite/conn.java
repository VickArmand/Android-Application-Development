package com.example.javabasics.JavaandSQLite;
import java.sql.*;
import java.nio.file.*;
public class conn {
    private final String Dbname = "db_blogs.db";
//    private String current_path = Paths.get("").toAbsolutePath().toString();
    private String current_path = FileSystems.getDefault().getPath(".").toAbsolutePath().toString();

    private final String ConnectionString = "jdbc:sqlite:"+current_path+Dbname;

    public Connection c = null;

    public Connection conn() throws SQLException {
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(ConnectionString);
            System.out.println("Connection generated successfully");
        }
        catch (Exception ex)
        {
            System.out.println("Connection Failed: "+ ex.getMessage());
            System.exit(0);
        }
        return c;
    }
}