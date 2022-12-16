package com.example.trainingsystem.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Departments")
public class Department {
    @Id
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("DepartmentName")
    private String DepartmentName;
}
