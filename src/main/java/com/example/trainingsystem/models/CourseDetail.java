package com.example.trainingsystem.models;

import com.example.trainingsystem.models.embedded.FinalExam_CourseDetail;
import com.example.trainingsystem.models.embedded.Session_CourseDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "CourseDetails")
public class CourseDetail {
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("CourseName")
    private String CourseName;

    @JsonProperty("ListOfSessions")
    private List<Session_CourseDetail> ListOfSessions;

    @JsonProperty("FinalExam")
    private FinalExam_CourseDetail FinalExam;
}
