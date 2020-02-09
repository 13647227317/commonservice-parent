package com.wy.springcloud.commonservice.nacosdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试前端控制器
 * @author wangyong
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${nacosConfig:1}")
    private String nacosConfig;

    @GetMapping("/test1")
    public String test1(){
        return nacosConfig;
    }
}
