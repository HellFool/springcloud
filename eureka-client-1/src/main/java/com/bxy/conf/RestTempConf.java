package com.bxy.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述信息 ()
 *
 * @author bxy
 * @Date 2019/11/12$ 14:48$
 * @version: V_1.0.0
 */
@Configuration
public class RestTempConf {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
