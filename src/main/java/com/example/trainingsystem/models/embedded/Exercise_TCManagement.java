package com.example.trainingsystem.models.embedded;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exercise_TCManagement {
    private String ExerciseDescription;
    private String Type;
    private String Submission;
    private double Mark;
    private double Weight;
}