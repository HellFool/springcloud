package com.bxy.controller;

import com.bxy.entity.OrderMaster;
import com.bxy.entity.ProductInfo;
import com.bxy.feign.OrderFeign;
import com.bxy.service.OrderService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 类描述信息 ()
 *
 * @author bxy
 * @Date 2019/11/14$ 14:46$
 * @version: V_1.0.0
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("create")
    public String create(@RequestBody Map<String,Integer> cart){
        try {
            OrderMaster orderMaster = new OrderMaster();
            Double total = 0.0;
            for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                String productId = entry.getKey();
                System.out.println("订单中获取到的商品ID:"+productId);
                Integer count = cart.get(productId);
                ProductInfo productInfo = orderFeign.selectById(productId);
                total+=count*productInfo.getProductPrice();
            }
            orderMaster.setOrderAmount(total);
            orderService.create(orderMaster);
            return "下单成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "下单失败";
        }

    }

}
