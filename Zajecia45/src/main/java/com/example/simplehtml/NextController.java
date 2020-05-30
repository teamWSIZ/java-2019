package com.example.simplehtml;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class NextController {
    @RequestMapping("student")
    String getHtml(@RequestParam(value = "name", defaultValue = "Przemysław") String name,
                   @RequestParam(value = "surname", defaultValue = "Stokłosa") String surname,
                   Model model){

        model.addAttribute("name",name);
        model.addAttribute("surname",surname);

        return "page0";
    }

    @RequestMapping("tablica")
    String getTable(Model model){
        ArrayList<Double> tab = new ArrayList<>();
        for(int i=0;i<10;i++)
            tab.add((double)i);

        model.addAttribute("table",tab);

        return "table0";
    }
}
