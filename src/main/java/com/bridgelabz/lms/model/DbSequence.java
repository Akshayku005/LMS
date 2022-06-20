package com.bridgelabz.lms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "db_sequence")
@AllArgsConstructor
@NoArgsConstructor
public @Data class DbSequence {
    @Id
    private String id;
    private int seq;
}