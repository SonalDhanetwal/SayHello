package com.phoenix.SayHello.controller.impl;

import com.phoenix.SayHello.controller.HelloController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerIImpl implements HelloController {

    @Override
    @RequestMapping("/sonal")
    public String sayHello() {
        return "Hi! This is 1st rest api from sonal";
    }
    @Override
    @RequestMapping("/goodmorning")
    public String sayGoodMorning(){return"Good Morning form Sonal";}
}
