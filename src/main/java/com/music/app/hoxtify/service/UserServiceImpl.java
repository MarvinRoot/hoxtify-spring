package com.music.app.hoxtify.service;

import com.music.app.hoxtify.model.User;
import com.music.app.hoxtify.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Override
    public ArrayList<User> getUsers() {
        return userRepo.getUsers();
    }
}