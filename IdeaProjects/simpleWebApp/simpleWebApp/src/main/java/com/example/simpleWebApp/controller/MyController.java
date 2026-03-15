package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@RequestMapping("yahia")

    public String greet(){

        return "Hello World! yahia";
    }
    @RequestMapping("about")
    public String about(){
        return "About page whoooo!!";
    }

}
