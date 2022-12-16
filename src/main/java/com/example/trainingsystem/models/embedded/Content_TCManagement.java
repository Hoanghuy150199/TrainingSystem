package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Content_TCManagement {
    @JsonProperty("ContentName")
    private String ContentName;

    @JsonProperty("Documentation")
    private String Documentation;

    @JsonProperty("Duration")
    private double Duration;

    @JsonProperty("Exercises")
    private List<Exercise_TCManagement> Exercises;
    //Exercises (Array of Obj: ExerciseDescription + Type + Submission + Mark + Weight)
}
