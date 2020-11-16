package com.bxy.controller;

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
@RequestMapping("cart")
public class CartController {


    @RequestMapping("addCart")
    public void addCart(String id, HttpSession session){
        Map<String,Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
        if (cart==null){
            cart = new HashMap<>();
            cart.put(id,1);
        }else {
            if (cart.containsKey(id)){
                cart.put(id,cart.get(id)+1);
            }else {
                cart.put(id,1);
            }
        }
        session.setAttribute("cart",cart);
    }

}
