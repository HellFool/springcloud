package com.bxy.feign;


import com.bxy.entity.User;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(serviceId = "EUREKA-CLIENT-2")

public interface FeignTest {

    @RequestMapping("/book/book")
    String book(@RequestParam("name") String name );

    @RequestMapping("/book/book1")
    String book1(@RequestParam("name")String name,@RequestParam("password")String password,@RequestParam("age")Integer age);

    @LoadBalanced
    @RequestMapping(value = "/book/book2",method = RequestMethod.POST)
    User book2(User user);

}
