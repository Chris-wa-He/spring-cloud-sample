package com.chris.feign.controller;

import com.chris.feign.domain.User;
import com.chris.feign.service.HelloService;
import com.chris.feign.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloUserConsumer() {

        StringBuilder StrBuil = new StringBuilder();
        StrBuil.append(helloService.hello()).append("\n");
        StrBuil.append(helloService.helloName("Chris")).append("\n");
        StrBuil.append(helloService.helloUserObj("Chris", 18)).append("\n");
        StrBuil.append(helloService.helloUserStr(new User("Chris", 18))).append("\n");
        return StrBuil.toString();
    }

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String refactorHelloUserConsumer() {

        StringBuilder StrBuil = new StringBuilder();
        StrBuil.append(refactorHelloService.helloName("Iron Man")).append("\n");
        StrBuil.append(refactorHelloService.helloUserObj("Iron Man", 40)).append("\n");
        StrBuil.append(refactorHelloService.helloUserStr(new com.chris.helloservice.api.dto.User("Iron Man", 40))).append("\n");
        return StrBuil.toString();
    }
}
