package com.example.trainingsystem.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Departments")
public class Department {
    private String _id;
    private String DepartmentName;
}
