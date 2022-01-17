package com.atguigu.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("@{server.port}")
    private String serverPort;


    @GetMapping(value="/payment/nacos/{id}")
    @ResponseBody
    public String getSomeThing(@PathVariable("id") Integer id){
        System.out.println("已经到达9001");

        return "9001";
    }

}
