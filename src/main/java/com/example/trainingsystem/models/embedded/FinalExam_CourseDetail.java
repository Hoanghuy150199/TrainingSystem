package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinalExam_CourseDetail {
    @JsonProperty("Type")
    private String Type;

    @JsonProperty("Source")
    private String Source;

    @JsonProperty("Weight")
    private double Weight;
}
