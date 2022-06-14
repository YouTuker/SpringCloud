package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/14
 */
@Configuration
public class MYSelfRule {


    /**
     * 随机选择
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }



}
