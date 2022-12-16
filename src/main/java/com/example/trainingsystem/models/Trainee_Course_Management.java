package com.example.trainingsystem.models;

import com.example.trainingsystem.models.embedded.Content_TCManagement;
import com.example.trainingsystem.models.embedded.FinalExam_TCManagement;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Trainee_Course_Management")
public class Trainee_Course_Management {
    @Id
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("TraineeName")
    private String TraineeName;

    @JsonProperty("CourseName")
    private String CourseName;

    @JsonProperty("Contents")
    private ArrayList<Content_TCManagement> Contents;
    //Add ContentName
    //Add Documentation
    //Add Duration
    //Add Exercises (Array of Obj: ExerciseDescription + Type + Submission + Mark + Weight)

    @JsonProperty("FinalExam")
    private FinalExam_TCManagement FinalExam;
    //Add Type + Submission + Mark1st + Mark2nd + Weight

    @JsonProperty("TotalScore")
    private double TotalScore;

    @JsonProperty("Status")
    private String Status;

    @JsonProperty("Level")
    private int Level;

    @JsonProperty("EnrollmentDate")
    private LocalDateTime EnrollmentDate;

    @JsonProperty("CompletedDate")
    private LocalDateTime CompletedDate;

    @JsonProperty("Rate")
    private int Rate;
}
