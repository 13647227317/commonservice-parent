package com.wy.springcloud.commonservice.consumerdemo.feign.fallback;

import com.wy.springcloud.commonservice.consumerdemo.feign.TestService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wangyong
 * @date 2020/2/2
 */
@Component
@Slf4j
public class TestServiceFallbackImpl implements TestService {
    @Setter
    private Throwable cause;

    @Override
    public String test1() {
        log.error("****************",cause);
        return "500";
    }
}
