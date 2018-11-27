package com.chris.feign.service.impl;

import com.chris.feign.service.RefactorHelloService;
import com.chris.helloservice.api.dto.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class RefactorHelloServiceFallBack implements RefactorHelloService {

    @Override
    @RequestMapping("/apiHelloNameFallBack")
    public String helloName(String name) {
        return "error!";
    }

    @Override
    @RequestMapping("/apiHelloUserObjFallBack")
    public User helloUserObj(String name, Integer age) {
        return new User("Unknow",0);
    }

    @Override
    @RequestMapping(value = "/apiHelloUserStrFallBack")
    public String helloUserStr(User user) {
        return "error!";
    }
}
