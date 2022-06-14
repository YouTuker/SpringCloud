package com.atguigu;

import com.myrule.MYSelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MYSelfRule.class)
public class Cloud_cosumer6003 {
    public static void main(String[] args) {
                SpringApplication.run(Cloud_cosumer6003.class,args);
            }
}
