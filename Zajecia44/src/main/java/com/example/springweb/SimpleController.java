package com.example.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    String getInfo(){
        return "info";
    }

    @RequestMapping("number")
    Double getNumber(){
        return 20.0;
    }
}
