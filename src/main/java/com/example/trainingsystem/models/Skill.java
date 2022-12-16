package com.example.trainingsystem.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "Skills")
public class Skill {
    @Id
    @JsonProperty("_id")
    private String _id;

    @Indexed(unique = true)
    @JsonProperty("SkillName")
    private String SkillName;
}