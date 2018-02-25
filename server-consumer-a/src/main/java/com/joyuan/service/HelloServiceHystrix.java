package com.joyuan.service;


import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements IHelloService {
    @Override
    public String say1() {
        return "say1错误默认返回";
    }
    @Override
    public String say2() {
        return "say2错误默认返回";
    }
}


