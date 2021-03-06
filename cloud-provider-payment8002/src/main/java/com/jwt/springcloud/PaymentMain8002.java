package com.jwt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wuli涛涛
 * @Title: 启动类
 * @date 2020/3/30 21:45
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
        System.out.println("payment8002启动成功");
    }
}
