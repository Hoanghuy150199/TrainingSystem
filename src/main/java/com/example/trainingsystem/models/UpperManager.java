package com.example.trainingsystem.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Upper_Managers")
public class UpperManager {
    private String _id;
    private String Username;
}
