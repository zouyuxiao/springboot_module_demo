package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${邹} on 2018/12/28.
 * 描述：
 */
@Controller
public class Main {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
