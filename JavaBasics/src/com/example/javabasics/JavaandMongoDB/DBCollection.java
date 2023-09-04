package com.example.javabasics.JavaandMongoDB;

import com.mongodb.MongoNamespace;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;
import com.mongodb.bulk.BulkWriteResult;
import com.mongodb.client.*;
import com.mongodb.client.model.*;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertManyResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DBCollection extends DBConnect{
    private MongoDatabase db = DBConnect();
    protected void Collectioncreate()
    {
        try {
            int i = 0;
            String collectionName;
            int id = Integer.parseInt(JOptionPane.showInputDialog("Please input the number of collections to create"));
            while (i < id) {
                collectionName = JOptionPane.showInputDialog("Please input the Collection name to be created");
                System.out.println(db);
                db.createCollection(collectionName);
                JOptionPane.showMessageDialog(null, "Collection "+collectionName+" created successfully");
                i++;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error creating collection "+ex);
        }
    }
    protected MongoCollection<Document> CollectionSelect()
    {
        MongoCollection<Document> collection = new MongoCollection<Document>() {
            @Override
            public MongoNamespace getNamespace() {
                return null;
            }

            @Override
            public Class<Document> getDocumentClass() {
                return null;
            }

            @Override
            public CodecRegistry getCodecRegistry() {
                return null;
            }

            @Override
            public ReadPreference getReadPreference() {
                return null;
            }

            @Override
            public WriteConcern getWriteConcern() {
                return null;
            }

            @Override
            public ReadConcern getReadConcern() {
                return null;
            }

            @Override
            public <NewTDocument> MongoCollection<NewTDocument> withDocumentClass(Class<NewTDocument> aClass) {
                return null;
            }

            @Override
            public MongoCollection<Document> withCodecRegistry(CodecRegistry codecRegistry) {
                return null;
            }

            @Override
            public MongoCollection<Document> withReadPreference(ReadPreference readPreference) {
                return null;
            }

            @Override
            public MongoCollection<Document> withWriteConcern(WriteConcern writeConcern) {
                return null;
            }

            @Override
            public MongoCollection<Document> withReadConcern(ReadConcern readConcern) {
                return null;
            }

            @Override
            public long countDocuments() {
                return 0;
            }

            @Override
            public long countDocuments(Bson bson) {
                return 0;
            }

            @Override
            public long countDocuments(Bson bson, CountOptions countOptions) {
                return 0;
            }

            @Override
            public long countDocuments(ClientSession clientSession) {
                return 0;
            }

            @Override
            public long countDocuments(ClientSession clientSession, Bson bson) {
                return 0;
            }

            @Override
            public long countDocuments(ClientSession clientSession, Bson bson, CountOptions countOptions) {
                return 0;
            }

            @Override
            public long estimatedDocumentCount() {
                return 0;
            }

            @Override
            public long estimatedDocumentCount(EstimatedDocumentCountOptions estimatedDocumentCountOptions) {
                return 0;
            }

            @Override
            public <TResult> DistinctIterable<TResult> distinct(String s, Class<TResult> aClass) {
                return null;
            }

            @Override
            public <TResult> DistinctIterable<TResult> distinct(String s, Bson bson, Class<TResult> aClass) {
                return null;
            }

            @Override
            public <TResult> DistinctIterable<TResult> distinct(ClientSession clientSession, String s, Class<TResult> aClass) {
                return null;
            }

            @Override
            public <TResult> DistinctIterable<TResult> distinct(ClientSession clientSession, String s, Bson bson, Class<TResult> aClass) {
                return null;
            }

            @Override
            public FindIterable<Document> find() {
                return null;
            }

            @Override
            public <TResult> FindIterable<TResult> find(Class<TResult> aClass) {
                return null;
            }

            @Override
            public FindIterable<Document> find(Bson bson) {
                return null;
            }

            @Override
            public <TResult> FindIterable<TResult> find(Bson bson, Class<TResult> aClass) {
                return null;
            }

            @Override
            public FindIterable<Document> find(ClientSession clientSession) {
                return null;
            }

            @Override
            public <TResult> FindIterable<TResult> find(ClientSession clientSession, Class<TResult> aClass) {
                return null;
            }

            @Override
            public FindIterable<Document> find(ClientSession clientSession, Bson bson) {
                return null;
            }

            @Override
            public <TResult> FindIterable<TResult> find(ClientSession clientSession, Bson bson, Class<TResult> aClass) {
                return null;
            }

            @Override
            public AggregateIterable<Document> aggregate(List<? extends Bson> list) {
                return null;
            }

            @Override
            public <TResult> AggregateIterable<TResult> aggregate(List<? extends Bson> list, Class<TResult> aClass) {
                return null;
            }

            @Override
            public AggregateIterable<Document> aggregate(ClientSession clientSession, List<? extends Bson> list) {
                return null;
            }

            @Override
            public <TResult> AggregateIterable<TResult> aggregate(ClientSession clientSession, List<? extends Bson> list, Class<TResult> aClass) {
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
            public MapReduceIterable<Document> mapReduce(String s, String s1) {
                return null;
            }

            @Override
            public <TResult> MapReduceIterable<TResult> mapReduce(String s, String s1, Class<TResult> aClass) {
                return null;
            }

            @Override
            public MapReduceIterable<Document> mapReduce(ClientSession clientSession, String s, String s1) {
                return null;
            }

            @Override
            public <TResult> MapReduceIterable<TResult> mapReduce(ClientSession clientSession, String s, String s1, Class<TResult> aClass) {
                return null;
            }

            @Override
            public BulkWriteResult bulkWrite(List<? extends WriteModel<? extends Document>> list) {
                return null;
            }

            @Override
            public BulkWriteResult bulkWrite(List<? extends WriteModel<? extends Document>> list, BulkWriteOptions bulkWriteOptions) {
                return null;
            }

            @Override
            public BulkWriteResult bulkWrite(ClientSession clientSession, List<? extends WriteModel<? extends Document>> list) {
                return null;
            }

            @Override
            public BulkWriteResult bulkWrite(ClientSession clientSession, List<? extends WriteModel<? extends Document>> list, BulkWriteOptions bulkWriteOptions) {
                return null;
            }

            @Override
            public InsertOneResult insertOne(Document document) {
                return null;
            }

            @Override
            public InsertOneResult insertOne(Document document, InsertOneOptions insertOneOptions) {
                return null;
            }

            @Override
            public InsertOneResult insertOne(ClientSession clientSession, Document document) {
                return null;
            }

            @Override
            public InsertOneResult insertOne(ClientSession clientSession, Document document, InsertOneOptions insertOneOptions) {
                return null;
            }

            @Override
            public InsertManyResult insertMany(List<? extends Document> list) {
                return null;
            }

            @Override
            public InsertManyResult insertMany(List<? extends Document> list, InsertManyOptions insertManyOptions) {
                return null;
            }

            @Override
            public InsertManyResult insertMany(ClientSession clientSession, List<? extends Document> list) {
                return null;
            }

            @Override
            public InsertManyResult insertMany(ClientSession clientSession, List<? extends Document> list, InsertManyOptions insertManyOptions) {
                return null;
            }

            @Override
            public DeleteResult deleteOne(Bson bson) {
                return null;
            }

            @Override
            public DeleteResult deleteOne(Bson bson, DeleteOptions deleteOptions) {
                return null;
            }

            @Override
            public DeleteResult deleteOne(ClientSession clientSession, Bson bson) {
                return null;
            }

            @Override
            public DeleteResult deleteOne(ClientSession clientSession, Bson bson, DeleteOptions deleteOptions) {
                return null;
            }

            @Override
            public DeleteResult deleteMany(Bson bson) {
                return null;
            }

            @Override
            public DeleteResult deleteMany(Bson bson, DeleteOptions deleteOptions) {
                return null;
            }

            @Override
            public DeleteResult deleteMany(ClientSession clientSession, Bson bson) {
                return null;
            }

            @Override
            public DeleteResult deleteMany(ClientSession clientSession, Bson bson, DeleteOptions deleteOptions) {
                return null;
            }

            @Override
            public UpdateResult replaceOne(Bson bson, Document document) {
                return null;
            }

            @Override
            public UpdateResult replaceOne(Bson bson, Document document, ReplaceOptions replaceOptions) {
                return null;
            }

            @Override
            public UpdateResult replaceOne(ClientSession clientSession, Bson bson, Document document) {
                return null;
            }

            @Override
            public UpdateResult replaceOne(ClientSession clientSession, Bson bson, Document document, ReplaceOptions replaceOptions) {
                return null;
            }

            @Override
            public UpdateResult updateOne(Bson bson, Bson bson1) {
                return null;
            }

            @Override
            public UpdateResult updateOne(Bson bson, Bson bson1, UpdateOptions updateOptions) {
                return null;
            }

            @Override
            public UpdateResult updateOne(ClientSession clientSession, Bson bson, Bson bson1) {
                return null;
            }

            @Override
            public UpdateResult updateOne(ClientSession clientSession, Bson bson, Bson bson1, UpdateOptions updateOptions) {
                return null;
            }

            @Override
            public UpdateResult updateOne(Bson bson, List<? extends Bson> list) {
                return null;
            }

            @Override
            public UpdateResult updateOne(Bson bson, List<? extends Bson> list, UpdateOptions updateOptions) {
                return null;
            }

            @Override
            public UpdateResult updateOne(ClientSession clientSession, Bson bson, List<? extends Bson> list) {
                return null;
            }

            @Override
            public UpdateResult updateOne(ClientSession clientSession, Bson bson, List<? extends Bson> list, UpdateOptions updateOptions) {
                return null;
            }

            @Override
            public UpdateResult updateMany(Bson bson, Bson bson1) {
                return null;
            }

            @Override
            public UpdateResult updateMany(Bson bson, Bson bson1, UpdateOptions updateOptions) {
                return null;
            }

            @Override
            public UpdateResult updateMany(ClientSession clientSession, Bson bson, Bson bson1) {
                return null;
            }

            @Override
            public UpdateResult updateMany(ClientSession clientSession, Bson bson, Bson bson1, UpdateOptions updateOptions) {
                return null;
            }

            @Override
            public UpdateResult updateMany(Bson bson, List<? extends Bson> list) {
                return null;
            }

            @Override
            public UpdateResult updateMany(Bson bson, List<? extends Bson> list, UpdateOptions updateOptions) {
                return null;
            }

            @Override
            public UpdateResult updateMany(ClientSession clientSession, Bson bson, List<? extends Bson> list) {
                return null;
            }

            @Override
            public UpdateResult updateMany(ClientSession clientSession, Bson bson, List<? extends Bson> list, UpdateOptions updateOptions) {
                return null;
            }

            @Override
            public Document findOneAndDelete(Bson bson) {
                return null;
            }

            @Override
            public Document findOneAndDelete(Bson bson, FindOneAndDeleteOptions findOneAndDeleteOptions) {
                return null;
            }

            @Override
            public Document findOneAndDelete(ClientSession clientSession, Bson bson) {
                return null;
            }

            @Override
            public Document findOneAndDelete(ClientSession clientSession, Bson bson, FindOneAndDeleteOptions findOneAndDeleteOptions) {
                return null;
            }

            @Override
            public Document findOneAndReplace(Bson bson, Document document) {
                return null;
            }

            @Override
            public Document findOneAndReplace(Bson bson, Document document, FindOneAndReplaceOptions findOneAndReplaceOptions) {
                return null;
            }

            @Override
            public Document findOneAndReplace(ClientSession clientSession, Bson bson, Document document) {
                return null;
            }

            @Override
            public Document findOneAndReplace(ClientSession clientSession, Bson bson, Document document, FindOneAndReplaceOptions findOneAndReplaceOptions) {
                return null;
            }

            @Override
            public Document findOneAndUpdate(Bson bson, Bson bson1) {
                return null;
            }

            @Override
            public Document findOneAndUpdate(Bson bson, Bson bson1, FindOneAndUpdateOptions findOneAndUpdateOptions) {
                return null;
            }

            @Override
            public Document findOneAndUpdate(ClientSession clientSession, Bson bson, Bson bson1) {
                return null;
            }

            @Override
            public Document findOneAndUpdate(ClientSession clientSession, Bson bson, Bson bson1, FindOneAndUpdateOptions findOneAndUpdateOptions) {
                return null;
            }

            @Override
            public Document findOneAndUpdate(Bson bson, List<? extends Bson> list) {
                return null;
            }

            @Override
            public Document findOneAndUpdate(Bson bson, List<? extends Bson> list, FindOneAndUpdateOptions findOneAndUpdateOptions) {
                return null;
            }

            @Override
            public Document findOneAndUpdate(ClientSession clientSession, Bson bson, List<? extends Bson> list) {
                return null;
            }

            @Override
            public Document findOneAndUpdate(ClientSession clientSession, Bson bson, List<? extends Bson> list, FindOneAndUpdateOptions findOneAndUpdateOptions) {
                return null;
            }

            @Override
            public void drop() {

            }

            @Override
            public void drop(ClientSession clientSession) {

            }

            @Override
            public void drop(DropCollectionOptions dropCollectionOptions) {

            }

            @Override
            public void drop(ClientSession clientSession, DropCollectionOptions dropCollectionOptions) {

            }

            @Override
            public String createIndex(Bson bson) {
                return null;
            }

            @Override
            public String createIndex(Bson bson, IndexOptions indexOptions) {
                return null;
            }

            @Override
            public String createIndex(ClientSession clientSession, Bson bson) {
                return null;
            }

            @Override
            public String createIndex(ClientSession clientSession, Bson bson, IndexOptions indexOptions) {
                return null;
            }

            @Override
            public List<String> createIndexes(List<IndexModel> list) {
                return null;
            }

            @Override
            public List<String> createIndexes(List<IndexModel> list, CreateIndexOptions createIndexOptions) {
                return null;
            }

            @Override
            public List<String> createIndexes(ClientSession clientSession, List<IndexModel> list) {
                return null;
            }

            @Override
            public List<String> createIndexes(ClientSession clientSession, List<IndexModel> list, CreateIndexOptions createIndexOptions) {
                return null;
            }

            @Override
            public ListIndexesIterable<Document> listIndexes() {
                return null;
            }

            @Override
            public <TResult> ListIndexesIterable<TResult> listIndexes(Class<TResult> aClass) {
                return null;
            }

            @Override
            public ListIndexesIterable<Document> listIndexes(ClientSession clientSession) {
                return null;
            }

            @Override
            public <TResult> ListIndexesIterable<TResult> listIndexes(ClientSession clientSession, Class<TResult> aClass) {
                return null;
            }

            @Override
            public void dropIndex(String s) {

            }

            @Override
            public void dropIndex(String s, DropIndexOptions dropIndexOptions) {

            }

            @Override
            public void dropIndex(Bson bson) {

            }

            @Override
            public void dropIndex(Bson bson, DropIndexOptions dropIndexOptions) {

            }

            @Override
            public void dropIndex(ClientSession clientSession, String s) {

            }

            @Override
            public void dropIndex(ClientSession clientSession, Bson bson) {

            }

            @Override
            public void dropIndex(ClientSession clientSession, String s, DropIndexOptions dropIndexOptions) {

            }

            @Override
            public void dropIndex(ClientSession clientSession, Bson bson, DropIndexOptions dropIndexOptions) {

            }

            @Override
            public void dropIndexes() {

            }

            @Override
            public void dropIndexes(ClientSession clientSession) {

            }

            @Override
            public void dropIndexes(DropIndexOptions dropIndexOptions) {

            }

            @Override
            public void dropIndexes(ClientSession clientSession, DropIndexOptions dropIndexOptions) {

            }

            @Override
            public void renameCollection(MongoNamespace mongoNamespace) {

            }

            @Override
            public void renameCollection(MongoNamespace mongoNamespace, RenameCollectionOptions renameCollectionOptions) {

            }

            @Override
            public void renameCollection(ClientSession clientSession, MongoNamespace mongoNamespace) {

            }

            @Override
            public void renameCollection(ClientSession clientSession, MongoNamespace mongoNamespace, RenameCollectionOptions renameCollectionOptions) {

            }
        };
        try {
            String collectionName = JOptionPane.showInputDialog("Please input the Collection name to be selected for more operations");
            collection = db.getCollection(collectionName);
            JOptionPane.showMessageDialog(null, "Collection "+collectionName+ "selected successfully");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error selecting collection "+ex);
        }
        return collection;
    }
    protected ArrayList CollectionList()
    {
        ArrayList<String> cols = new ArrayList<String>();
        try {
            for (String name : db.listCollectionNames()) {
                cols.add(name);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error listing collections "+ex);
        }
        return cols;
    }
    protected void CollectionDrop()
    {
        MongoCollection<Document> collection;
        try {
            String collectionName = JOptionPane.showInputDialog("Please input the Collection name to drop");
            collection = CollectionSelect();
            collection.drop();
            JOptionPane.showMessageDialog(null, "Collection "+collectionName+ "dropped successfully");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error dropping collection "+ex);
        }
    }
}
