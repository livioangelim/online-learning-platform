package com.lvo.online_learning_platform.repository;

import com.lvo.online_learning_platform.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}