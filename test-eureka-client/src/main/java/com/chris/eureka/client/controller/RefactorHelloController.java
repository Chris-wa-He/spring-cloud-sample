package com.chris.eureka.client.controller;

import com.chris.helloservice.api.dto.User;
import com.chris.helloservice.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorHelloController implements HelloService {

    @Override
    public String helloName(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @Override
    public User helloUserObj(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        System.out.println("Get request:\n name:" + name + "\n age:" + age);
        return new User(name, age);
    }

    @Override
    public String helloUserStr(@RequestBody User user) {
        System.out.println("Get Obj:" + user);
        return user.toString();
    }
}
