package com.jwt.springcloud.controller;

import com.jwt.springcloud.entities.CommonResult;
import com.jwt.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        CommonResult paymentById = paymentFeignService.getPaymentById(id);
        return paymentById ;
    }
}
