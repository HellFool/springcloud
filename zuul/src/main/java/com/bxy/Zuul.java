package com.bxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//可以支持zookeeper作为注册中心
//@EnableDiscoveryClient
//只支持Eureka作为注册中心
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Zuul {

    public static void main(String[] args) {
        SpringApplication.run(Zuul.class, args);
    }

}
