package com.tutu.edu.background.com.tutu.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
    @RequestMapping("/getData")
    @ResponseBody
    public String getDatas() {
        System.out.println("hhhhh1");
        return "data1";
    }
}
