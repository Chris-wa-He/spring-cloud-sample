package com.chris.feign.controller;

import com.chris.feign.domain.User;
import com.chris.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

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

}
