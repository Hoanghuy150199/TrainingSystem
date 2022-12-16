package com.example.trainingsystem.models;

import com.example.trainingsystem.models.embedded.CompletedClass_Trainee;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "Trainees")
public class Trainee {
    @Id
    @JsonProperty("_id")
    private String _id;

    @NotBlank
    @Indexed(unique = true)
    @JsonProperty("Username")
    private String Username;

    @NotBlank
    @JsonProperty("Password")
    private String Password;

    @JsonProperty("TraineeName")
    private String TraineeName;

    @JsonProperty("SkillSet")
    private List<String> SkillSet;

    @JsonProperty("ListOfClassesCompleted")
    private List<CompletedClass_Trainee> ListOfClassesCompleted; //Add ClassName + TotalScore

    @JsonProperty("Level")
    private String Level;
}