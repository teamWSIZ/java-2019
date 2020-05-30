package com.example.simplehtml;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    String getInfo(){
        return "info";
    }
    // name?name=przemyslaw&surname=stoklosa
    @RequestMapping("name")
    String getName(@RequestParam("name") String n, @RequestParam("surname") String s){
        return n+" "+s;
    }
}
