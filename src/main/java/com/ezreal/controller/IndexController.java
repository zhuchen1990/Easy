package com.ezreal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ezreal# on 2017/7/11.
 */
@Controller
public class IndexController {

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }



}
