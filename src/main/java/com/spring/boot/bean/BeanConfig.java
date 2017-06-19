package com.spring.boot.bean;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aditya Gupta
 */
@Configuration
@EnableConfigurationProperties
public class BeanConfig {
    @Bean
    private static String hello(){
        return "MY Spring Boot Application";
    }
}
