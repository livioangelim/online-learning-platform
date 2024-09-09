package com.lvo.online_learning_platform.repository;

import com.lvo.online_learning_platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
