package com.joyuan.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say1")
    public String say1(){
        return "say1随机数:"+new Random().nextInt(100);
    }

    @RequestMapping("/say2")
    public String say2(){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "say2随机数:"+new Random().nextInt(100);
    }
}
