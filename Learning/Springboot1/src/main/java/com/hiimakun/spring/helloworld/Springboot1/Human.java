package com.hiimakun.spring.helloworld.Springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    //Tự động tiêm 1 instance của Food vào Human khi khởi tạo Human để làm thuộc tính
    @Autowired
    Food food;

    public Human(Food food1){
        this.food = food1;
    }
}
