package com.example.SimpleWebApp;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String greet(){
        return "Welcome to project";
    }

}
