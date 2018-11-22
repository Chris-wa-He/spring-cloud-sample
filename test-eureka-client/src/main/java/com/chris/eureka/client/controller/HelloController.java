package com.chris.eureka.client.controller;

import com.chris.eureka.client.domain.User;
import com.chris.eureka.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;


@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host:" + instance.getHost() + " server_id:" + instance.getServiceId());
        return "Hello world!";
    }

    @RequestMapping(value = "/helloName", method = RequestMethod.GET)
    public String helloName(@RequestParam String name) {
        return userService.helloName(name);
    }

    @RequestMapping(value = "/helloUserObj", method = RequestMethod.GET)
    public User helloUserObj(@RequestHeader String name, @RequestHeader Integer age) {
        return userService.helloUserObj(name, age);
    }

    @RequestMapping(value = "/helloUserStr", method = RequestMethod.POST)
    public String helloUserStr(@RequestBody User user) {
        return userService.helloUserStr(user);
    }
}
