package com.bxy.controller;

import com.bxy.entity.User;
import com.bxy.feign.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述信息 ()
 *
 * @author bxy
 * @Date 2019/11/12$ 14:45$
 * @version: V_1.0.0
 */
@RestController
@RequestMapping("feign")
public class FeignController {

    @Autowired
    FeignTest feignTest;

    @RequestMapping("feign")
    public String feign(String name){
        String s = feignTest.book(name);
        return s;
    }

    @RequestMapping("feign1")
    public String feign1(String name,String password,Integer age){
        String s = feignTest.book1(name, password, age);
        return s;
    }

    @RequestMapping("feign2")
    public User feign2(User user){
        User user1 = feignTest.book2(user);
        return user1;
    }


}
