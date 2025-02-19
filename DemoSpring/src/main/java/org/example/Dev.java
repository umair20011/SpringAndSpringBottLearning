package org.example;

public class Dev {

    private int age;

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public void build(){
        System.out.println("Working on Awesome Project");
    }

}
