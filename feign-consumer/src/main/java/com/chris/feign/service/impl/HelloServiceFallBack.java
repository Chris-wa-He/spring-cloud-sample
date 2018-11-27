package com.chris.feign.service.impl;

import com.chris.feign.domain.User;
import com.chris.feign.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallBack implements HelloService {

    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String helloName(String name) {
        return "error";
    }

    @Override
    public User helloUserObj(String name, Integer age) {
        return new User("Unknow",0);
    }

    @Override
    public String helloUserStr(User user) {
        return "error";
    }
}
