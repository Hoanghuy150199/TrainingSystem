package com.example.trainingsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Trainee_Course_Management {
    private String Id;
    private String TraineeName;
    private String CourseName;
    private ArrayList<Object> Contents;
    //Add ContentName
    //Add Documentation
    //Add Duration
    //Add Exercises (Array of Obj: ExerciseDescription + Type + Submission + Mark + Weight)
    //Add QA (Array of Obj: Comment + Author + DateOfComment)

    private ArrayList<Object> FinalExam;
    //Add Type + Submission + Mark1st + Mark2nd + Weight

    private int TotalScore;
    private String Status;
    private String Level;
    private LocalDateTime EnrollmentDate;
    private LocalDateTime CompletedDate;
}
