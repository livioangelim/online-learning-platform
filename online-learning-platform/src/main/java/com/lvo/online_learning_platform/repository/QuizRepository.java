package com.lvo.online_learning_platform.repository;

import com.lvo.online_learning_platform.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
