package com.bxy.controller;

import com.bxy.entity.ProductInfo;
import com.bxy.feign.ProductFeign;
import com.bxy.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * 类描述信息 ()
 *
 * @author bxy
 * @Date 2019/11/14$ 14:34$
 * @version: V_1.0.0
 */
@Controller
@RequestMapping("product")
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductFeign productFeign;

    @RequestMapping("selectAll")
    public String selectAll(HttpSession session){
        List<ProductInfo> list = productInfoService.selectAll();
        session.setAttribute("list",list);
        return "redirect:/product.jsp";
    }

    @RequestMapping("addOrder")
    @ResponseBody
    public String addOrder(HttpSession session){
        Map<String,Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
        String result = productFeign.create(cart);
        return result;
    }

    @RequestMapping("selectById")
    @ResponseBody
    public ProductInfo selectById(String productId){
        System.out.println("从订单中接收到的商品ID   "+productId);
        return productInfoService.selectById(productId);
    }

}
