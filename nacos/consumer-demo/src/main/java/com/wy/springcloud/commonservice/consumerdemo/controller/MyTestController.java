package com.wy.springcloud.commonservice.consumerdemo.controller;

import com.wy.springcloud.commonservice.consumerdemo.feign.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试前端控制器
 * @author wangyong
 */
@RestController
public class MyTestController {
    @Resource
    private TestService testService;
    @GetMapping("/test1")
    public String test1(){
        return testService.test1();
    }
}
