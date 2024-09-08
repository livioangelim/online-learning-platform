package com.lvo.online_learning_platform.service;

import com.lvo.online_learning_platform.model.Enrollment;
import com.lvo.online_learning_platform.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public Enrollment enroll(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }
}