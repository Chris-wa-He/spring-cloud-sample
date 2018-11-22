package com.chris.eureka.client.service.impl;

import com.chris.eureka.client.domain.User;
import com.chris.eureka.client.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

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
