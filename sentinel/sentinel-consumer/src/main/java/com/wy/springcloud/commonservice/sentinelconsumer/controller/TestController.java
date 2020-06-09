package com.wy.springcloud.commonservice.sentinelconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyong
 * @date 2020/4/8
 * @description
 */
@RestController
public class TestController {
    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }
}
