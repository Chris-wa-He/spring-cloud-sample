package com.chris.feign.service;

import com.chris.helloservice.api.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("hello-service")
public interface RefactorHelloService extends HelloService {
}
