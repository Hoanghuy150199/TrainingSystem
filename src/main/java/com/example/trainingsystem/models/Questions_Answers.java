package com.example.trainingsystem.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

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

    @JsonProperty("ContentName")
    private String ContentName;

    @JsonProperty("Comment")
    private String Comment;

    @JsonProperty("Author")
    private String Author;

    @JsonProperty("DateOfComment")
    private LocalDateTime DateOfComment;
}
