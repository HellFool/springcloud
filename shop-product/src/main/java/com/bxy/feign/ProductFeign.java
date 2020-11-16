package com.bxy.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(serviceId = "SHOP-ORDER")
public interface ProductFeign {

    @RequestMapping(value = "/order/order/create",method = RequestMethod.POST)
    String create(Map<String,Integer> cart);
}
