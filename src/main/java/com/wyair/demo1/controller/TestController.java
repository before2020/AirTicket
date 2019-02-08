package com.wyair.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController
{
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) {
        System.out.println("test controller--------------");
        return "index";
    }
}
