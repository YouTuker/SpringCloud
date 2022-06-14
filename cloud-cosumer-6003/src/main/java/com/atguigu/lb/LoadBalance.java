package com.atguigu.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/14
 */
public interface LoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
