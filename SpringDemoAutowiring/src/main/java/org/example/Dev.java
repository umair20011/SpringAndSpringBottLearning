package org.example;

public class Dev {

    private Computer com;

    public void setCom(Computer com){
        this.com=com;
    }

    public void build(){

        System.out.println("working on a project");

        com.compile();
    }
}
