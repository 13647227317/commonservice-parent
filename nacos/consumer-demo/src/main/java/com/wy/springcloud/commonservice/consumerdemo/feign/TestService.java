package com.wy.springcloud.commonservice.consumerdemo.feign;

import com.wy.springcloud.commonservice.consumerdemo.feign.factory.TestServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign接口
 * @author wangyong
 */
@FeignClient(contextId="TestService",value="nacosdemo",fallbackFactory = TestServiceFallbackFactory.class)
public interface TestService {
    @GetMapping("/test1")
    String test1();
}
