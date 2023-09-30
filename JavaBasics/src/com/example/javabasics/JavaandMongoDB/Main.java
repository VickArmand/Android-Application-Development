package com.example.javabasics.JavaandMongoDB;

import com.example.javabasics.JavaandSQLite.crud;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import javax.print.Doc;
import javax.swing.*;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

    public static void main(String[] args) {
        DBConnect db = new DBConnect();
        DBCollection coll = new DBCollection();
        DBDocumentcrud crud = new DBDocumentcrud();
        HashMap<String, String> data = new HashMap<String, String>();
//        coll.Collectioncreate();
        System.out.println("List of available collections are: "+coll.CollectionList());
        MongoCollection <Document> collection = coll.CollectionSelect();
        createDocumentTest(collection, crud, data);
        createDocumentTest(collection, crud, data);
        readTest(collection, crud);
        updateTest(collection, crud, data);
        findTest(collection, crud);
        deleteTest(collection, crud);
        readTest(collection, crud);
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
    private static void createDocumentTest(MongoCollection<Document> collection, DBDocumentcrud obj, HashMap data)
    {
        Date d = new Date();
        data.put("title", JOptionPane.showInputDialog("Please enter the post title"));
        data.put("slug", StrtoSlug((String) data.get("title")));
        data.put("body", JOptionPane.showInputDialog("Please enter the post body"));
        data.put("time", d.toString());
        obj.create(collection, data);
    }
    private static void readTest(MongoCollection<Document> collection, DBDocumentcrud obj){
        obj.read(collection);
    }
    private static void findTest(MongoCollection<Document> collection, DBDocumentcrud obj) {
        String slug = JOptionPane.showInputDialog("Please enter the slug of the post to find");
        MongoCursor iter = obj.find(collection, slug);
        while (iter.hasNext())
            System.out.println(iter.next());
    }
    private static void updateTest(MongoCollection<Document> collection, DBDocumentcrud obj, HashMap data) {

        String slug = JOptionPane.showInputDialog("Please enter the slug of the post to update");
        Date d = new Date();
        data.put("title", JOptionPane.showInputDialog("Please enter the post title"));
        data.put("slug", StrtoSlug((String) data.get("title")));
        data.put("body", JOptionPane.showInputDialog("Please enter the post body"));
        data.put("time", d.toString());
        obj.update(collection, data, slug);
    }
    private static void deleteTest(MongoCollection<Document> collection, DBDocumentcrud obj) {

        String slug = JOptionPane.showInputDialog("Please enter the slug of the post to delete");
        obj.delete(collection, slug);
    }
}
