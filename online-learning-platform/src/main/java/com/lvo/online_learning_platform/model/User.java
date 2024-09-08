package com.lvo.online_learning_platform.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
//@Table(name = "`users`") //For escaping the table name for H2
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private Role role; // Enum (STUDENT, INSTRUCTOR)
}
