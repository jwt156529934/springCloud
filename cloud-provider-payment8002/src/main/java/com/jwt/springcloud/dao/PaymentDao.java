package com.jwt.springcloud.dao;

import com.jwt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wuli涛涛
 * @Title: PaymentDao
 * @date 2020/3/3022:08
 */
@Mapper
public interface PaymentDao {
    /**
     * 创建
     */
    public int create(Payment payment);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
