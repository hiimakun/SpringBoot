package com.vinorsoft.springboot.swaggertuturial.service;

import com.vinorsoft.springboot.swaggertuturial.entity.User;
import com.vinorsoft.springboot.swaggertuturial.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUser(){
        return userRepo.findAll();
    }

    public User saveUser(User user){
        return userRepo.save(user);
    }

}
