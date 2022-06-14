package com.atguigu.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cloudAlibaba-provide-payment")
public interface FeignTo9001 {

    @GetMapping("/payment/nacos/1")
    String  getProvidePayment9001();

}
