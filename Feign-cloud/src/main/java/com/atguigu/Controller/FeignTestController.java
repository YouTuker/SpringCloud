package com.atguigu.Controller;

import com.atguigu.Feign.FeignTo9001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignTestController {

     @Autowired
     private FeignTo9001 feignTo9001;

    @GetMapping("/feignTest")
    public String FeignTest(){
        System.out.println("进入FeignTest");
        return feignTo9001.getProvidePayment9001();
    }

}
