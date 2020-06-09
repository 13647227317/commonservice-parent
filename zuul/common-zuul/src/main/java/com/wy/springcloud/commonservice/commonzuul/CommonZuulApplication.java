package com.wy.springcloud.commonservice.commonzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CommonZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonZuulApplication.class, args);
    }

}
