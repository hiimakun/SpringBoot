package com.hiimakun.spring.helloworld.Springboot1;

import org.springframework.stereotype.Component;

@Component
public class Rice implements Food{

    @Override
    public void eat() {
        System.out.println("An com");
    }
}
