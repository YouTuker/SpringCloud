package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Cloud_Alibaba_provide_payment9002 {
    public static void main(String[] args) {
                SpringApplication.run(Cloud_Alibaba_provide_payment9002.class,args);
            }
}
