package com.wy.springcloud.commonservice.consumerdemo.feign.factory;

import com.wy.springcloud.commonservice.consumerdemo.feign.TestService;
import com.wy.springcloud.commonservice.consumerdemo.feign.fallback.TestServiceFallbackImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author wangyong
 * @date 2020/2/2
 */
@Component
public class TestServiceFallbackFactory implements FallbackFactory<TestService> {
    @Override
    public TestService create(Throwable throwable) {
        TestServiceFallbackImpl testServiceFallback = new TestServiceFallbackImpl();
        testServiceFallback.setCause(throwable);
        return testServiceFallback;
    }
}
