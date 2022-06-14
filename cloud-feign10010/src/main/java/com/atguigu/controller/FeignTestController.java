package com.atguigu.controller;

import com.atguigu.Feign.FeignTo9001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class FeignTestController {

     @Autowired
     private FeignTo9001 feignTo9001;

    @GetMapping("/feign")
    public String FeignTest(){
        System.out.println("进入FeignTest");
        return feignTo9001.getHello();
    }

}
