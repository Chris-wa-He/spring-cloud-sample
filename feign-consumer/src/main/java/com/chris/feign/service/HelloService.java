package com.chris.feign.service;

import com.chris.feign.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/helloName", method = RequestMethod.GET)
    String helloName(@RequestParam("name") String name);

    @RequestMapping(value = "/helloUserObj", method = RequestMethod.GET)
    String helloUserObj(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/helloUserStr", method = RequestMethod.POST)
    String helloUserStr(@RequestBody User user);
}
