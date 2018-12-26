package com.practice.services;

import com.practice.exceptions.UserNotFoundException;
import com.practice.models.User;
import com.practice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserById(Long userId) throws UserNotFoundException {
        User user = userRepository.findByUserId(userId);

        if(Objects.isNull(user))
            throw new UserNotFoundException("User not found!");
        return user;
    }
}
