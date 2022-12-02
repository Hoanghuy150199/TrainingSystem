package com.example.trainingsystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Accounts")
public class Account {
    @Id
    private String Id;

    @Field
    private String Username;
    @Field
    private String Password;
    @Field
    private String Role;

    @Override
    public String toString() {
        return "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
