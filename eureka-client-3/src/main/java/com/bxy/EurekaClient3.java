package com.bxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//可以支持zookeeper作为注册中心
//@EnableDiscoveryClient
//只支持Eureka作为注册中心
@EnableEurekaClient
@SpringBootApplication
public class EurekaClient3 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient3.class, args);
    }

}
