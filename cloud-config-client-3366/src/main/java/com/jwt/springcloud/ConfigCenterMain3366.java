package com.jwt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigCenterMain3366 {
    public static void main(String[] args) {
        SpringApplication.run( ConfigCenterMain3366.class,args);
    }
}
