package com.example.trainingsystem;

import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;

@SpringBootApplication
public class TrainingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingSystemApplication.class, args);

        String uri = "mongodb+srv://LET-PASS-TEAM:LET-PASS-TEAM@let-pass-team.g9qjbnz.mongodb.net/test";
//        try (MongoClient mongoClient = MongoClients.create(uri)) {
//            MongoDatabase database = mongoClient.getDatabase("TrainingSystem");
//            try {
//                Bson command = new BsonDocument("ping", new BsonInt64(1));
//                Document commandResult = database.runCommand(command);
//                System.out.println("Connected successfully to server.");
//            } catch (MongoException me) {
//                System.err.println("An error occurred while attempting to run a command: " + me);
//            }
//        }
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("TrainingSystem");
        MongoCollection<Document> col_Trainees = database.getCollection("Trainees");
        for (String name : database.listCollectionNames()) {
            System.out.println(name);
        }
//        Document doc = col_Trainees.find(Filters.eq("Username", "Trung123")).first();
//        System.out.println(doc);
//        if (doc != null) {
//            System.out.println("{ ");
//            System.out.println("_id: " + doc.getObjectId("_id")
//                    + ", Username: " + doc.getString("Username")
//                    + ", Password: " + doc.getString("Password"));
//            System.out.println(" }");
//        }
        FindIterable<Document> doc = col_Trainees.find();
        Iterator it = doc.iterator();
        System.out.println("\nList of trainees:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
