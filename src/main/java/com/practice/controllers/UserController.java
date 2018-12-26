package com.practice.controllers;


import com.practice.exceptions.UserNotFoundException;
import com.practice.models.User;
import com.practice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) throws UserNotFoundException {
        return userService.getUserById(userId);
    }
}
