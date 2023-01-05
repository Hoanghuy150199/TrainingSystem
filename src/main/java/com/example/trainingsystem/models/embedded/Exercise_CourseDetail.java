package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exercise_CourseDetail {
    @JsonProperty("ExerciseName")
    private String ExerciseName;

    @JsonProperty("Type")
    private String Type;

    @JsonProperty("Source")
    private String Source;

    @JsonProperty("Weight")
    private double Weight;
}
