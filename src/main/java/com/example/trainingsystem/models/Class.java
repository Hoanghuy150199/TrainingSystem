package com.example.trainingsystem.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Classes")
public class Class {
    @Id
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("ClassName")
    private String ClassName;

    @JsonProperty("RoleName")
    private String RoleName;

    @JsonProperty("ListOfOrderedCourses")
    private ArrayList<String> ListOfOrderedCourses;

    @JsonProperty("SumOfHours")
    private double SumOfHours;

    @JsonProperty("StartDate")
    private LocalDate StartDate;

    @JsonProperty("EndDate")
    private LocalDate EndDate;

    @JsonProperty("CertificateTemplate")
    private String CertificateTemplate;
}
