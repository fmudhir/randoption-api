package ws.randoption;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class DatabaseManager {

    public MongoClient getClient() {

        MongoClient mongoClient = null;

        try {

            mongoClient = new MongoClient();

        } catch (Exception e) {

            System.err.println("Caught Mogo Exception: " + e.getMessage());
        }

        return mongoClient;
    }

    public DB getRDB () {

        MongoClient mongoClient = getClient();

        DB database = mongoClient.getDB("RDB");

        return database;
    }
}