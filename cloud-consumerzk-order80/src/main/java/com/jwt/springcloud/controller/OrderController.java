package com.jwt.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    //通过在zookeeper上注册过的微服务名称调用
    private static final String PAYMENT_URL = "http://cloud-payment-service";

    @GetMapping("/consumer/payment/zk")
    public String getPayment(){
        return restTemplate.getForObject(PAYMENT_URL+"/zk/get",String.class);
    }
}
