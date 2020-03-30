package com.jwt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wuli涛涛
 * @Title: 启动类
 * @date 2020/3/3021:45
 */
@SpringBootApplication
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
        System.out.println("payment8001启动成功");
    }
}
