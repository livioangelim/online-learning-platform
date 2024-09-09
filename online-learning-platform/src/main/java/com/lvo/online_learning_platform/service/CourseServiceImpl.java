package com.lvo.online_learning_platform.service;

import com.lvo.online_learning_platform.model.Course;
import com.lvo.online_learning_platform.model.User;
import com.lvo.online_learning_platform.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    // Implement this method to get courses for a specific user
    @Override
    public List<Course> findByUser(User user) {
        return courseRepository.findByUser(user);
    }
}
