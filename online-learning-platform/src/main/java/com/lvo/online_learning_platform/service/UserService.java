package com.lvo.online_learning_platform.service;

import com.lvo.online_learning_platform.model.User;

import java.util.List;


public interface UserService {
    void save(User user);
    List<User> getAllUsers();

}
