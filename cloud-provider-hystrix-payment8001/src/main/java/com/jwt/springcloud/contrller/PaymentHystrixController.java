package com.jwt.springcloud.contrller;

import com.jwt.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuli涛涛
 * @Title: PaymentHystrixController
 * @ProjectName cloud2020
 * @Description: TODO
 * @date 2020/4/617:56
 */
@RestController
@Slf4j
public class PaymentHystrixController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfoOK(id);
        log.info("*****result："+result);
        return result;
    }

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("*****result："+result);
        return result;
    }

    //    ***************服务熔断************************
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String circuitBreaker = paymentService.paymentCircuitBreaker(id);
        log.info("******result: "+circuitBreaker);
        return circuitBreaker;
    }
}
