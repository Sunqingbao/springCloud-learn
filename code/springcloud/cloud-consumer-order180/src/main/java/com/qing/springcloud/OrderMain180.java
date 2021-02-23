package com.qing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: sunQB
 * @Date: 2021-01-28 21:10
 * @Since: JDK-
 */

@SpringBootApplication
@EnableEurekaClient
public class OrderMain180 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain180.class,args);
    }
}
