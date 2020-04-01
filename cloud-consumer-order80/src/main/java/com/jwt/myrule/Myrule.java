package com.jwt.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myrule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机
    }
}
