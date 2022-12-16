package com.example.trainingsystem.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Trainers")
public class Trainer {
    private String _id;
    private String Username;
    private String Password;
    private String TrainerName;
    private String Profile;
    private String Level;
    private Email Email;
}
