package com.jwt.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wuli涛涛
 * @Title: Payment实体类
 * @date 2020/3/3022:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private static final long serialVersionUID = -7473077466908773379L;
    private Long id;
    private String serial;
}
