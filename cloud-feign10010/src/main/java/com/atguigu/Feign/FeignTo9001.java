package com.atguigu.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cloud-cosumer-6003")
public interface FeignTo9001 {

    @GetMapping("/hello")
    public String getHello();

}
