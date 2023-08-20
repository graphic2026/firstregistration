package com.registered.firstregistration.service;

import com.registered.firstregistration.entity.User;
import com.registered.firstregistration.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo repo;


    @Override
    public void registerUser(User user){
        repo.save(user);

    }

}
