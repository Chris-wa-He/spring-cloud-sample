package com.chris.helloservice.api.service;

import com.chris.helloservice.api.dto.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/helloService-refactor")
public interface HelloService {

    @RequestMapping(value = "/apiHelloName", method = RequestMethod.GET)
    String helloName(@RequestParam("name") String name);

    @RequestMapping(value = "/apiHelloUserObj", method = RequestMethod.GET)
    User helloUserObj(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/apiHelloUserStr", method = RequestMethod.POST)
    String helloUserStr(@RequestBody User user);
}
