package com.lvo.online_learning_platform.controller;

import com.lvo.online_learning_platform.model.Course;
import com.lvo.online_learning_platform.model.User;
import com.lvo.online_learning_platform.service.CourseService;
import com.lvo.online_learning_platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private UserService userService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/dashboard")
    public String showDashboard(Model model, Authentication authentication) {
        String username = authentication.getName();
        User user = userService.findByUsername(username);
        List<Course> courses = courseService.findByUser(user);

        model.addAttribute("user", user);
        model.addAttribute("courses", courses);
        return "dashboard";
    }
}
