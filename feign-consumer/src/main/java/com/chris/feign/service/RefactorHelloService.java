package com.chris.feign.service;

import com.chris.feign.config.FullLogConfig;
import com.chris.feign.service.impl.RefactorHelloServiceFallBack;
import com.chris.helloservice.api.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "hello-service", fallback = RefactorHelloServiceFallBack.class, configuration = FullLogConfig.class)
public interface RefactorHelloService extends HelloService {
}
