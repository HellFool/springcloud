package com.bxy.controller;

import com.bxy.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("book")
public class BookController {


    @RequestMapping("book")
    public String book(String name){

        return "当前调用的是Client2  "+name ;
    }

    @RequestMapping("book1")
    public String book1(String name,String password,Integer age){

        return "当前调用的是Client2  "+name+"    password   "+ password+"   age    "+age;
    }


    @RequestMapping("book2")
    public User book2(@RequestBody User user){

        return user;
    }
}
