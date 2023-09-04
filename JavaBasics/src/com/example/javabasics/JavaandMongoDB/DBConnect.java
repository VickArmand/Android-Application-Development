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
    private final String dbName = "blogs";
    private final String userName = "vickarmand";
    private final String pwd = "devickarmand";
    MongoDatabase db;
    protected MongoDatabase DBConnect() {
        try {
            //  Creating Mongo Client
            MongoClient mongo = new MongoClient() {
                @Override
                public MongoDatabase getDatabase(String s) {
                    return null;
                }

                @Override
                public ClientSession startSession() {
                    return null;
                }

                @Override
                public ClientSession startSession(ClientSessionOptions clientSessionOptions) {
                    return null;
                }

                @Override
                public void close() {

                }

                @Override
                public MongoIterable<String> listDatabaseNames() {
                    return null;
                }

                @Override
                public MongoIterable<String> listDatabaseNames(ClientSession clientSession) {
                    return null;
                }

                @Override
                public ListDatabasesIterable<Document> listDatabases() {
                    return null;
                }

                @Override
                public ListDatabasesIterable<Document> listDatabases(ClientSession clientSession) {
                    return null;
                }

                @Override
                public <TResult> ListDatabasesIterable<TResult> listDatabases(Class<TResult> aClass) {
                    return null;
                }

                @Override
                public <TResult> ListDatabasesIterable<TResult> listDatabases(ClientSession clientSession, Class<TResult> aClass) {
                    return null;
                }

                @Override
                public ChangeStreamIterable<Document> watch() {
                    return null;
                }

                @Override
                public <TResult> ChangeStreamIterable<TResult> watch(Class<TResult> aClass) {
                    return null;
                }

                @Override
                public ChangeStreamIterable<Document> watch(List<? extends Bson> list) {
                    return null;
                }

                @Override
                public <TResult> ChangeStreamIterable<TResult> watch(List<? extends Bson> list, Class<TResult> aClass) {
                    return null;
                }

                @Override
                public ChangeStreamIterable<Document> watch(ClientSession clientSession) {
                    return null;
                }

                @Override
                public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, Class<TResult> aClass) {
                    return null;
                }

                @Override
                public ChangeStreamIterable<Document> watch(ClientSession clientSession, List<? extends Bson> list) {
                    return null;
                }

                @Override
                public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, List<? extends Bson> list, Class<TResult> aClass) {
                    return null;
                }

                @Override
                public ClusterDescription getClusterDescription() {
                    return null;
                }
            };
            //  Creating credentials
            MongoCredential credential = MongoCredential.createCredential(userName, dbName, pwd.toCharArray());
            JOptionPane.showMessageDialog(null, "Connection established successfully");
            //  Accessing the db
            db = mongo.getDatabase(dbName);
            JOptionPane.showMessageDialog(null, "Credentials are: "+credential);

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error establishing connection "+ex);
        }
        return db;
    }
}
