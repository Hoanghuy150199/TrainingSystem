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
import java.util.Scanner;

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

        //Connect to TrainingSystem DB
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("TrainingSystem");

        //Connect to Accounts collection
        MongoCollection<Document> col_Accounts = database.getCollection("Accounts");

        //Print all collections
        for (String name : database.listCollectionNames()) {
            System.out.println(name);
        }

        System.out.print("Input username: ");
        String uname = (new Scanner(System.in)).nextLine();
        System.out.print("Input password: ");
        String pw = (new Scanner(System.in)).nextLine();

        //Find document using input username & check input password
        try {
            Document doc = col_Accounts.find(Filters.eq("Username", uname)).first();
            if (pw.equals(doc.getString("Password"))) {
                String role = doc.getString("Role");
                System.out.println("Role: " + role);
            }
            else {
                System.out.println("Wrong password!");
            }
        }
        catch(Exception e){
            System.out.println("Wrong username!");
        }

//        System.out.println(doc);
//        if (doc != null) {
//            System.out.println("{ ");
//            System.out.println("_id: " + doc.getObjectId("_id")
//                    + ", Username: " + doc.getString("Username")
//                    + ", Password: " + doc.getString("Password"))
//            ;
//            System.out.println(" }");
//        }
//        FindIterable<Document> doc2 = col_Accounts.find();
//        Iterator it = doc2.iterator();
//        System.out.println("\nList of accounts:");
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
    }

}
