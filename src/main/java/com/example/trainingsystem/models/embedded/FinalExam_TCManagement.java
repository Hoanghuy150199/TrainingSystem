package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinalExam_TCManagement {
    @JsonProperty("Type")
    private String Type;

    @JsonProperty("Submission")
    private String Submission;

    @JsonProperty("Mark1st")
    private double Mark1st;

    @JsonProperty("Mark2nd")
    private double Mark2nd;

    @JsonProperty("Weight")
    private double Weight;
}
