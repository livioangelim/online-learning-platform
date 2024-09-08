package com.lvo.online_learning_platform.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "courses")
//@Table(name = "`courses`") //For escaping the table name for H2
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String instructor;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
