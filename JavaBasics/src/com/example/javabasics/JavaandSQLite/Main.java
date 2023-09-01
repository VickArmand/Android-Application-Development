package com.example.javabasics.JavaandSQLite;

import java.sql.SQLException;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.swing.*;

public class Main {
    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");
    HashMap <String, String> data = new HashMap<String, String>();

    public static void main(String[] args) throws SQLException {
        createDB create = new createDB();
        crud opserationsobject = new crud();
        HashMap <String, String> first = new HashMap<String, String>();
        createTest(first,opserationsobject);
        updateTest(first, opserationsobject);
        deleteTest(opserationsobject);
        readTest(opserationsobject);
        findTest(opserationsobject);

    }
    private static String StrtoSlug(String input)
    {
        if (input == null)
            throw new IllegalArgumentException();

        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }
    private static void createTest(HashMap data, crud obj) throws SQLException {
        data.put("title", JOptionPane.showInputDialog("Please enter the post title"));
        data.put("slug", StrtoSlug((String) data.get("title")));
        data.put("body", JOptionPane.showInputDialog("Please enter the post body"));
        obj.create(data);
    }
    private static void readTest(crud obj) throws SQLException {
        obj.read();
    }
    private static void findTest(crud obj) throws SQLException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Post ID to find"));
        System.out.println(obj.find(id));
    }
    private static void updateTest(HashMap data, crud obj) throws SQLException {

        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Post ID to edit"));
        data.put("title", JOptionPane.showInputDialog("Please enter the post title"));
        data.put("slug", StrtoSlug((String) data.get("title")));
        data.put("body", JOptionPane.showInputDialog("Please enter the post body"));
        obj.update(id, data);
    }
    private static void deleteTest(crud obj) throws SQLException {

        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Post ID to delete"));
        obj.delete(id);
    }
}
