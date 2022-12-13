package com.example.trainingsystem.models;

import com.example.trainingsystem.enums.ERole;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Accounts")
public class Account {
    @Id
    @JsonProperty("_id")
    private String _id;

    @NotBlank
    @Indexed(unique = true)
    @JsonProperty("Username")
    private String Username;

    @NotBlank
    @JsonProperty("Password")
    private String Password;

    @Field
    @JsonProperty("Role")
    private ERole Role;
}
