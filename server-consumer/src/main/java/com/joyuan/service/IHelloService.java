package com.joyuan.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "server-a",fallback = HelloServiceHystrix.class)
public interface IHelloService{
    @RequestMapping(value = "/hello/say1")
    String say1();
    @RequestMapping(value = "/hello/say2")
    String say2();
}
