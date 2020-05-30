package com.example.simplehtml;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NextController {
    @RequestMapping("gethtml")
    String getHtml(){
        return "zwrócono stronę";
    }
}
