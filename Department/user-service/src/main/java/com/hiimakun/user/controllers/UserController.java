package com.hiimakun.user.controllers;

import com.hiimakun.user.entities.User;
import com.hiimakun.user.services.UserService;
import com.hiimakun.user.valueObject.ResponseObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseObject getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
