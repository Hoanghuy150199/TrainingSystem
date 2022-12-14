package com.example.trainingsystem.models;

import com.example.trainingsystem.models.embedded.QA_Questions_Answers;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Questions_Answers")
public class Questions_Answers {
    @Id
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("CourseName")
    private String CourseName;

    @JsonProperty("SessionName")
    private String SessionName;

    @JsonProperty("QA")
    private List<QA_Questions_Answers> QA;
}
