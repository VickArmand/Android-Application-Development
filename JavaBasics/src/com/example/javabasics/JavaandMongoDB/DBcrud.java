package com.example.javabasics.JavaandMongoDB;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.HashMap;
import java.util.Iterator;

public class DBcrud extends DBConnect {
    protected FindIterable<Document> it;
    protected void create(MongoCollection<Document> collection, HashMap data)
    {

    }
    protected void read(MongoCollection<Document> collection)
    {
        it = collection.find();
        int i = 1;
        for (Document document : it) {
            System.out.println(document);
            i++;
        }
    }
    protected void find(MongoCollection<Document> collection, String slug)
    {
    }
    protected void update(MongoCollection<Document> collection, HashMap data)
    {

    }
    protected void delete(MongoCollection<Document> collection, String slug)
    {

    }
}
