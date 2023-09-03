package com.example.postsappwithsqlite;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private final String Dbname = "db_blogs.db";
//    private String current_path = Paths.get("/").toAbsolutePath().toString();
    //    OR
//    private String current_path = FileSystems.getDefault().getPath("/").toAbsolutePath().toString();
//    private final String ConnectionString = "jdbc:sqlite:"+current_path+Dbname;
    private final String ConnectionString = "jdbc:sqlite:"+Dbname;
    public Connection c = null;

    public Connection Connect() throws SQLException {
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
