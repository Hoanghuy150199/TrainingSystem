package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Session_CourseDetail {
    @JsonProperty("SessionName")
    private String SessionName;

    @JsonProperty("Documentation")
    private String Documentation;

    @JsonProperty("ListOfExercises")
    private List<Exercise_CourseDetail> ListOfExercises;

    @JsonProperty("ListOfContents")
    private ArrayList<Content_CourseDetail> ListOfContents;
}
