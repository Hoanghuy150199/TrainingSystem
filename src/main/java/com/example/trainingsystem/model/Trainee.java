package com.example.trainingsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Trainee {
    private String Id;
    private String Username;
    private String Password;
    private String TraineeName;
    private List<String> SkillSet;
    private List<Object> ListOfClassesCompleted; //Add ClassName + TotalScore
    private String Level;
}