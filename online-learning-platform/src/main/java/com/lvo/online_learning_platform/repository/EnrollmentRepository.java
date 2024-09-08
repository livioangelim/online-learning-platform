package com.lvo.online_learning_platform.repository;

import com.lvo.online_learning_platform.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
