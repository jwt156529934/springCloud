package com.jwt.springcloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CasTest {
    @Test
    public void casTest1(){
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger);
        System.out.println(atomicInteger.compareAndSet(10,5));
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5,10));
        System.out.println(atomicInteger.get());
    }
}
