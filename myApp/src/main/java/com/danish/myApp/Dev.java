package com.danish.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    @Qualifier("laptop")   // used for calling method of laptop class using Computer type no need of @Primary annotation
    private Computer com;       // Feiled dependency injection


//    public Dev(Laptop laptop){
//        this.laptop=laptop;               // constructor injection
//    }

//    @Autowired
//    private void setter(Laptop laptop){        // setter injection
//        this.laptop=laptop;
//    }


    public void build(){

        com.compile();

        System.out.println("Building Something........");
    }

}
