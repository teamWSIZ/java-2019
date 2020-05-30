package com.example.simplehtml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class NextController {
    @RequestMapping("index")
    String getHtml(){
        return "page0";
    }
}
