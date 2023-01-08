package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Content_CourseDetail {
    @JsonProperty("ContentName")
    private String ContentName;

    @JsonProperty("Documentation")
    private String Documentation;

    @JsonProperty("Duration")
    private double Duration;
}
