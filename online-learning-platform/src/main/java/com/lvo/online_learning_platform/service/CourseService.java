package com.lvo.online_learning_platform.service;

import com.lvo.online_learning_platform.model.Course;
import com.lvo.online_learning_platform.model.User;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course createCourse(Course course);

    // Add this method
    List<Course> findByUser(User user);
}