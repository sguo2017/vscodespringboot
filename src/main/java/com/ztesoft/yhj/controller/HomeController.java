package com.ztesoft.yhj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @RequestMapping("/test")
    public String index(){
        return "你好，欢迎使用vscode1";
    }
}