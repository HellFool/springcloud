package com.bxy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * 类描述信息 ()
 *
 * @author bxy
 * @Date 2019/11/12$ 14:43$
 * @version: V_1.0.0
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping("order")
    @HystrixCommand(fallbackMethod = "fallBack")
    public String order(String name){
        String result = restTemplate.getForObject("http://EUREKA-CLIENT-2/book/book?name=" + name, String.class);
        return result;
    }

    public String  fallBack(String name){
        return "<font style='color:red'>server is down   "+name+"</font>";
    }

    @RequestMapping("order2")
    public String order2(String name,String password,Integer age){
        Map<String, Object> map = new HashMap<>();
        map.put("name",name);
        map.put("password",password);
        map.put("age",age);
        String result = restTemplate.getForObject("http://EUREKA-CLIENT-2/book/book1?name={name}&password={password}&age={age}", String.class,map);
        return result;
    }

    @RequestMapping("order1")
    public String order1(String name){
        ServiceInstance serviceInstance = loadBalancerClient.choose("EUREKA-CLIENT-2");
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        String serviceId = serviceInstance.getServiceId();
        URI uri = serviceInstance.getUri();
        System.out.println(host);
        System.out.println(port);
        System.out.println(serviceId);
        System.out.println(uri);

        return null;
    }


    @RequestMapping("order3")
    public String order3(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Hello  Zuul";
    }




}
