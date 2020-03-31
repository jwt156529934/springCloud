package com.jwt.springcloud.service;


import com.jwt.springcloud.entities.Payment;

public interface PaymentService {
    /**
     * 创建
     */
    public int create(Payment payment);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id);
}
