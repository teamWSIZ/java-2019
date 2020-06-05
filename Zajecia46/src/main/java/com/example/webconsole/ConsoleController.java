package com.example.webconsole;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ConsoleController {
    ArrayList<String> consoleText = new ArrayList<>();

    @RequestMapping("")
    String getConsole(Model model){
        example();

        model.addAttribute("consoleText",consoleText);
        return "console";
    }

    void example(){
        //System.out.println("Single line")

        for(int i=0;i<20;i++)
            consoleText.add("Single line");
    }
}
