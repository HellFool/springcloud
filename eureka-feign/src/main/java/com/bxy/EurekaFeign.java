package com.bxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//可以支持zookeeper作为注册中心
//@EnableDiscoveryClient
//只支持Eureka作为注册中心
@EnableEurekaClient

//开启feign支持
@EnableFeignClients
@SpringBootApplication
public class EurekaFeign {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeign.class, args);
    }

}
