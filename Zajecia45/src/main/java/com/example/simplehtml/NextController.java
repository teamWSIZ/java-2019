package com.example.simplehtml;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}