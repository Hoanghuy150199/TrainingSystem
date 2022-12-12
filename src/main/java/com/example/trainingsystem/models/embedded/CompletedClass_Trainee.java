package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
public class CompletedClass_Trainee {
    @JsonProperty("ClassName")
    private String ClassName;
    @JsonProperty("TotalScore")
    private int TotalScore;
}
