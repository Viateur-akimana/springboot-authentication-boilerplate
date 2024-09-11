package com.rest.apis.controller;

import com.rest.apis.model.User;
import com.rest.apis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User createUser(@RequestBody User user){
        return userService.register(user);
    }
}
