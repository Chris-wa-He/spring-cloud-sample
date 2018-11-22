package com.chris.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestEurekaClientApplication.class, args);
    }
}
