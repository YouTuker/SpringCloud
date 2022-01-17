package com.atguigu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderNacosController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value="/payment/nacos/{id}")

    public String getAssession(@PathVariable("id") Integer id){
        System.out.println("进入8001");
        return restTemplate.getForObject("http://localhost:9001/payment/nacos/"+id,String.class);

    }

}
