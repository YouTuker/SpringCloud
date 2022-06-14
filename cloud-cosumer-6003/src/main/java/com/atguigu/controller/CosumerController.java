package com.atguigu.controller;

import com.atguigu.lb.LoadBalance;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/14
 */
@RestController
public class CosumerController {

    @Autowired
    private LoadBalance loadBalance;

    @Autowired
    private RestTemplate restTemplate;

    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    @GetMapping("/hello")
    public String getHello(){
        return "HelloWorld";
    }

    @GetMapping("/consumer/payment/lb")
    public String getPaymentLB(){

        List<ServiceInstance> instances = null;
        if (instances == null || instances.size() <= 0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalance.instance(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri + "/payment/lb", String.class);

    }

}
