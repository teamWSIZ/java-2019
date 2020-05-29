package com.example.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SimpleController {
    @RequestMapping("/")
    String getInfo() {
        return "info";
    }

    //http://localhost:8080/equation?A=40&B=5&C=2&x=2

    @RequestMapping("equation")
    Double getNumber(@RequestParam(value = "A", defaultValue = "2.0") Double a,
                     @RequestParam(value = "B", defaultValue = "2.0") Double b,
                     @RequestParam(value = "C", defaultValue = "2.0") Double c,
                     @RequestParam(value = "x", defaultValue = "1.0") Double x) {
        //y=a*x^2+bx+c
        return a * x + x + b * x + c;
    }

    @RequestMapping("equation/print")
    String getEquation(@RequestParam(value = "A", defaultValue = "2.0") Double a,
                     @RequestParam(value = "B", defaultValue = "2.0") Double b,
                     @RequestParam(value = "C", defaultValue = "2.0") Double c,
                     @RequestParam(value = "x", defaultValue = "1.0") Double x) {
        //y=a*x^2+bx+c
        return a+"*x^2+"+b+"*x+"+c;
    }

    @RequestMapping("equation/sample")
    ArrayList<Double> getArray(@RequestParam(value = "A", defaultValue = "2.0") Double a,
                               @RequestParam(value = "B", defaultValue = "2.0") Double b,
                               @RequestParam(value = "C", defaultValue = "2.0") Double c,
                               @RequestParam(value = "x", defaultValue = "1.0") Double x){
        ArrayList<Double> array = new ArrayList<>();
        for(int i=0;i<100;i++)
            array.add((double)i);

        return array;
    }
}
