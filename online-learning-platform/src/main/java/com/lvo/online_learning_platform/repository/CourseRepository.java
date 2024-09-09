package com.lvo.online_learning_platform.repository;

import com.lvo.online_learning_platform.model.Course;
import com.lvo.online_learning_platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByUser(User user);
}
