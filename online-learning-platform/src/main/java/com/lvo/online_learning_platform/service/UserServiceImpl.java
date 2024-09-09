package com.lvo.online_learning_platform.service;

import com.lvo.online_learning_platform.model.User;
import com.lvo.online_learning_platform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Implement this method to find user by username
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
