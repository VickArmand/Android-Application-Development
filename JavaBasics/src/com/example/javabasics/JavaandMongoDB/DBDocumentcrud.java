package com.example.javabasics.JavaandMongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class DBDocumentcrud extends DBConnect {
    private String fields[] = {"title", "slug", "body", "time"};
    protected FindIterable<Document> it;
    protected void create(MongoCollection<Document> collection, HashMap data)
    {
        int i = 0;
        boolean is_null = false;
        Document document = new Document();
        if (!find(collection, (String) data.get("slug")).hasNext()) {
            for (String x : fields) {
                if (data.get(x) == null || data.get(x).toString().length() == 0) {
                    System.out.println("Null input not allowed for " + x);
                    is_null = true;
                    break;
                }
                document.append(x, data.get(x));

            }
            //Inserting document into the collection
            if (!is_null) {
                collection.insertOne(document);
                System.out.println("Document inserted successfully");
            } else {
                System.out.println("Error inserting document");
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Post exists");
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
    protected MongoCursor find(MongoCollection<Document> collection, String slug)
    {
        MongoCursor document;
        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("slug", slug);
        document = collection.find(whereQuery).cursor();
//OR        document = collection.find(Filters.eq("slug", slug));
        return document;
    }
    protected void update(MongoCollection<Document> collection, HashMap data, String slug)
    {

        MongoCursor document;
        Document newValues = new Document();
        boolean is_null = false;
        document = find(collection, slug);
        if (!document.hasNext())
        {
            System.out.println("Document doesn't exist");
        }
        else {
            for (String x : fields) {
                if (data.get(x) == null || data.get(x).toString().length() == 0)
                {
                    System.out.println("Null input not allowed for " + x);
                    is_null = true;
                    break;
                }
                else
                    newValues.append(x, data.get(x));
            }
        }
        String val = (String) newValues.get("slug");
        newValues.remove("slug");
        if (!is_null) {
            for (String j : fields) {
                if (Objects.equals(j, "slug"))
                    collection.updateOne(Filters.eq("slug", slug), Updates.set(j, val));
                collection.updateOne(Filters.eq("slug", slug), Updates.set(j, newValues.get(j)));
            }
        }
    }
    protected void delete(MongoCollection<Document> collection, String slug)
    {
        // Deleting the documents
        collection.deleteOne(Filters.eq("slug", slug));
    }
}
