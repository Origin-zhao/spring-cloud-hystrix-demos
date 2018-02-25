package com.joyuan.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHandle")
    public String say1(){
        return restTemplate.getForObject("http://server-a/hello/say1",String.class);
    }

    @HystrixCommand(fallbackMethod = "errorHandle")
    public String say2(){
        return restTemplate.getForObject("http://server-a/hello/say2",String.class);
    }

    public String errorHandle(){
        return "错误默认返回";
    }

}
