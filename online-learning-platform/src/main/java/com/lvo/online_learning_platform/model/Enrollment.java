package com.lvo.online_learning_platform.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "enrollment")
//@Table(name = "`enrollment`") //For escaping the table name for H2
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User student;

    @ManyToOne
    private Course course;

    private LocalDateTime enrollmentDate;
}
