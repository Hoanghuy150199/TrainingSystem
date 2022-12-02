package com.example.trainingsystem.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Class {
    private String Id;
    private String ClassName;
    private String RoleName;
    private ArrayList<String> ListOfCourses;
    private double SumOfHours;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String Certificate;
}
