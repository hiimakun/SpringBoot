package com.hiimakun.user.services;

import com.hiimakun.user.entities.User;
import com.hiimakun.user.repositories.UserRepository;
import com.hiimakun.user.valueObject.Department;
import com.hiimakun.user.valueObject.ResponseObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseObject getUserWithDepartment(Long userId) {
        log.info("getUserWithDepartment of UserService");
        ResponseObject responseObject = new ResponseObject();
        User user = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" /*http://localhost:8083/departments/*/+ user.getDepartmentId()
                        ,Department.class);
        responseObject.setUser(user);
        responseObject.setDepartment(department);

        return responseObject;
    }
}
