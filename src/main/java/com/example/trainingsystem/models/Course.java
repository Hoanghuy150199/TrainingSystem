package com.example.trainingsystem.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Course {
    private String Id;
    private String CourseName;
    private double Duration;
    private double HoursOfTheory;
    private double HoursOfPractice;
    private String TrainerInfo;
    private String Description;
    private List<String> ListOfSkills;
    private String Type;
    private int NumberOfEnrollment;
    private LocalDateTime StartDate;
    private LocalDateTime EndDate;
}
