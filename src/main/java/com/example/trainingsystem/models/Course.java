package com.example.trainingsystem.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Courses")
public class Course {
    @Id
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("CourseName")
    private String CourseName;

    @JsonProperty("Duration")
    private double Duration;

    @JsonProperty("HoursOfTheory")
    private double HoursOfTheory;

    @JsonProperty("HoursOfPractice")
    private double HoursOfPractice;

    @NotBlank
    @JsonProperty("TrainerInfo")
    private String TrainerInfo;

    @JsonProperty("ListOfPreCourses")
    private List<String> ListOfPreCourses;

    @NotBlank
    @JsonProperty("Description")
    private String Description;

    @JsonProperty("ListOfSkills")
    private List<String> ListOfSkills;

    @JsonProperty("Type")
    private String Type;

    @JsonProperty("NumberOfEnrollment")
    private int NumberOfEnrollment;

    @JsonProperty("StartDate")
    private LocalDateTime StartDate;

    @JsonProperty("EndDate")
    private LocalDateTime EndDate;
}
