package com.joyuan.web;

import com.joyuan.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    IHelloService service;

    @RequestMapping("/say1")
    public String say1(){

        return service.say1();
    }

    @RequestMapping("/say2")
    public String say2(){
        return service.say2();
    }
}
