package com.jwt.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author wuli涛涛
 * @Title: PaymentHystrixServiceImpl
 * @ProjectName cloud2020
 * @date 2020/4/622:09
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService{

    @Override
    public String paymentInfoOK(Integer id) {
        return "PaymentHystrixServiceImpl fall back paymentInfoOK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentHystrixServiceImpl fall back paymentInfo_TimeOut";
    }
}
