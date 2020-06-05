package com.example.webconsole;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ConsoleController {
    ArrayList<String> consoleText = new ArrayList<>();

    @RequestMapping("")
    String getConsole(){
        return "console";
    }

    void example(){
        //System.out.println("Single line")
        consoleText.add("Single line");
    }
}
