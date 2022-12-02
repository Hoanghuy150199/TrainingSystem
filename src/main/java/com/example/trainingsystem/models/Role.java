package com.example.trainingsystem.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Role {
    private String Id;
    private String RoleName;
    private List<String> ListOfSkillsRequired;
    private String Department;
}
