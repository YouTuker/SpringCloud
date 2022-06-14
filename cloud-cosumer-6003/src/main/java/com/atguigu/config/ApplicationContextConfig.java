package com.atguigu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/14
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced()
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
