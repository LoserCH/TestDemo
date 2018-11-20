package com.htc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(value="name")String name,@RequestParam(value="password")String password ){
        System.out.println("name:"+name+",password:"+password);
        return "/helloWorld";
    }
    @RequestMapping(value="/main")
    public String toMain(){
        return "Main";
    }
    @RequestMapping(value="/helloWorld")
    public String tohelloWorld(){
        return "HelloWorld";
    }

}
