package org.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
private Computer comp;
    public void bulid(){

        comp.compile();

        System.out.println("working on Awesome Project");
    }
}
