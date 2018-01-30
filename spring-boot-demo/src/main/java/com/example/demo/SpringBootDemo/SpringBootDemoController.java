package com.example.demo.SpringBootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDemoController {

    @RequestMapping("/")
    public String springbootdemo(){
        return "hello springboot";
    }
}
