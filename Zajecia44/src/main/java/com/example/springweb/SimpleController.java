package com.example.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
    @RequestMapping("/")
    @ResponseBody
    String getInfo(){
        return "info";
    }

    @RequestMapping("number")
    @ResponseBody
    Double getNumber(){
        return 20.0;
    }
}
