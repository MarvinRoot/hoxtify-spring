package com.music.app.hoxtify.controller;

import com.music.app.hoxtify.model.User;
import com.music.app.hoxtify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String getPage() {
        return "Hello world";
    }

    @GetMapping(value = "/users")
    public ArrayList<User> getUsers() {
        return userService.getUsers();
    }
}