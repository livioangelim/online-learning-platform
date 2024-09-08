package com.lvo.online_learning_platform.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quiz")
//@Table(name = "`quiz`") //For escaping the table name for H2
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int totalMarks;

    @ManyToOne
    private Course course;
}
