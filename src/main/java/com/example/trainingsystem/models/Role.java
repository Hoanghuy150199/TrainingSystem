package com.example.trainingsystem.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Roles")
public class Role {
    private String _id;
    private String RoleName;
    private List<String> ListOfSkillsRequired;
    private String Department;
}
