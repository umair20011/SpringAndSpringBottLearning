package com.danish.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary                  // used to give preference in dev class while using Computer type to run method compile over Desktop class
public class Laptop implements Computer {
    public void compile(){

        System.out.println("Compiling with 404 bug");

    }
}
