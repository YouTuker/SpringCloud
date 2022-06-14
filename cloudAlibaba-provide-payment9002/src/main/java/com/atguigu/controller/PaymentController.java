package com.atguigu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping(value="/payment/nacos/{id}")
    public String getSomeThing(@PathVariable("id") Integer id){
        System.out.println("进入9002");
        return "2";
    }

}
