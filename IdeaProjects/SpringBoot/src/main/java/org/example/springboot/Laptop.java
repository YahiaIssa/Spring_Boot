package org.example.springboot;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public  void compile(){
        System.out.println("Compliing with 404 bugs");
    }
}
