package com.chris.eureka.client.controller;

import com.chris.helloservice.api.dto.User;
import com.chris.helloservice.api.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorHelloController implements HelloService {

    @Override
    public String helloName(String name) {
        return "Hello " + name;
    }

    @Override
    public User helloUserObj(String name, Integer age) {
        return new User(name, age);
    }

    @Override
    public String helloUserStr(User user) {
        return user.toString();
    }
}
