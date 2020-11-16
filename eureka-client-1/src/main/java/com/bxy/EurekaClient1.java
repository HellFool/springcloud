package com.bxy;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//可以支持zookeeper作为注册中心
//@EnableDiscoveryClient
//只支持Eureka作为注册中心
@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
public class EurekaClient1 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1.class, args);
    }

}
