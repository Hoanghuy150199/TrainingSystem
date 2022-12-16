package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exercise_TCManagement {
    @JsonProperty("ExerciseDescription")
    private String ExerciseDescription;

    @JsonProperty("Type")
    private String Type;

    @JsonProperty("Submission")
    private String Submission;

    @JsonProperty("Mark")
    private double Mark;

    @JsonProperty("Weight")
    private double Weight;
}