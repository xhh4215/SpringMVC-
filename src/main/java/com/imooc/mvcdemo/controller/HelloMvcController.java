package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
    //host:8080/hello/mvc
    @RequestMapping("/mvc")
    public String HelloMvc(){
        return "home";
    }
}
