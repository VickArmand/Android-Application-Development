package com.example.javabasics.JavaandSQLite;

import java.sql.SQLException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws SQLException {
        HashMap first = null;
        createDB create = new createDB();
        first.put("title", "My First Post");
        first.put("slug", "My-First-Post");
        first.put("body", "This is My First Post");
        crud ops = new crud();
        ops.create(first);
        ops.read();
    }
}
