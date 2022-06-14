package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableConfigServer
public class Cloud_config3344 {
    public static void main(String[] args) {
                SpringApplication.run(Cloud_config3344.class,args);
            }
}
