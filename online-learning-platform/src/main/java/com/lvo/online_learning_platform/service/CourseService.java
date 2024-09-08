package com.lvo.online_learning_platform.service;

import com.lvo.online_learning_platform.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course createCourse(Course course);
    // Other course-related methods
}