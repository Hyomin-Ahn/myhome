package com.myproject.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //가장 기본이 되는 첫 페이지는 지정X
    @GetMapping
    public String index(){
        return "index";
    }
}
