package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cloud_Alibaba_provide_payment9001 {
    public static void main(String[] args) {
                SpringApplication.run(Cloud_Alibaba_provide_payment9001.class,args);
            }
}
