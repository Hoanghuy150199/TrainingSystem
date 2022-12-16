package com.example.trainingsystem.models;

import com.example.trainingsystem.models.embedded.Content_TCManagement;
import lombok.*;
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
    private String _id;
    private String TraineeName;
    private String CourseName;
    private ArrayList<Content_TCManagement> Contents;
    //Add ContentName
    //Add Documentation
    //Add Duration
    //Add Exercises (Array of Obj: ExerciseDescription + Type + Submission + Mark + Weight)
    //Add QA (Array of Obj: Comment + Author + DateOfComment)

    private Object FinalExam;
    //Add Type + Submission + Mark1st + Mark2nd + Weight

    private int TotalScore;
    private String Status;
    private String Level;
    private LocalDateTime EnrollmentDate;
    private LocalDateTime CompletedDate;
    private int Rate;
}
