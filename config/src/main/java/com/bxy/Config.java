package com.bxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//可以支持zookeeper作为注册中心
//@EnableDiscoveryClient
//只支持Eureka作为注册中心
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class Config {

    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }

}
