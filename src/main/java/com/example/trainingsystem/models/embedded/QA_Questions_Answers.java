package com.example.trainingsystem.models.embedded;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class QA_Questions_Answers {
    @JsonProperty("Comment")
    private String Comment;

    @JsonProperty("Author")
    private String Author;

    @JsonProperty("DateOfComment")
    private LocalDateTime DateOfComment;
}
