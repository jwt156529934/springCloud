package com.jwt.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.jwt.springcloud.alibaba.dao"})
public class MyBatisConfig {

}

