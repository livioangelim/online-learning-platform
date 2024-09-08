package com.lvo.online_learning_platform.controller;

import com.lvo.online_learning_platform.model.Enrollment;
import com.lvo.online_learning_platform.service.EnrollmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public Enrollment enrollInCourse(@RequestBody Enrollment enrollment) {
        return enrollmentService.enroll(enrollment);
    }
}