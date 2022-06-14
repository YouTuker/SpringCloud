package com.atguigu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cloud_eureka_server7002 {
    public static void main(String[] args) {
                SpringApplication.run(Cloud_eureka_server7002.class,args);
            }
}
