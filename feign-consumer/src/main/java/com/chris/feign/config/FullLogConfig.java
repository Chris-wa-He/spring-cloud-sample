package com.chris.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FullLogConfig {

    @Bean
    Logger.Level feignFullLoggerLevel(){
        return Logger.Level.FULL;
    }
}
