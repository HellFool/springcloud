package com.bxy.feign;

import com.bxy.entity.ProductInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(serviceId = "SHOP-PRODUCT")
public interface OrderFeign {

    @RequestMapping("/product/product/selectById")
    ProductInfo selectById(@RequestParam("productId") String productId);

}
