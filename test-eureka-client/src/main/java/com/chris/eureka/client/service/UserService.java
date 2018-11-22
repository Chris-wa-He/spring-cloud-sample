package com.chris.eureka.client.service;

import com.chris.eureka.client.domain.User;

public interface UserService {

    String helloName(String name);

    User helloUserObj(String name, Integer age);

    String helloUserStr(User user);

}
