package com.example.javabasics.JavaandMongoDB;
import com.mongodb.ClientSessionOptions;
import com.mongodb.client.*;
import com.mongodb.MongoCredential;
import com.mongodb.connection.ClusterDescription;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.swing.*;
import java.util.List;

public class DBConnect {
    private final String dbName = "dbname";
    private final String userName = "username";
    private final String pwd = "password";
    MongoDatabase db;
    protected MongoDatabase DBConnect() {
        try {
            //  Creating Mongo Client
            MongoClient mongo = MongoClients.create("mongodb://localhost:27017/");
            //  Creating credentials
            MongoCredential credential = MongoCredential.createCredential(userName, dbName, pwd.toCharArray());
            JOptionPane.showMessageDialog(null, "Connection established successfully");
            //  Accessing the db
            db = mongo.getDatabase(dbName);
            System.out.println(mongo);
            JOptionPane.showMessageDialog(null, "Credentials are: "+credential);

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error establishing connection "+ex);
        }
        return db;
    }
}
