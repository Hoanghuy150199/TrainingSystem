package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompletedClass_Trainee {
    @JsonProperty("ClassName")
    private String ClassName;

    @JsonProperty("TotalScore")
    private double TotalScore;
}
