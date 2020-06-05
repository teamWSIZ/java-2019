package com.example.webconsole;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsoleController {
    @RequestMapping("")
    String getConsole(){
        return "console";
    }
}
