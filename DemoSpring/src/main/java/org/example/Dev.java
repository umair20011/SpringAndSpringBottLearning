package org.example;

public class Dev {

    private Laptop laptop;
    private int age;

    public Dev(int age){
        this.age=age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }

    public void build(){
        System.out.println("Working on Awesome Project");
        laptop.compile();

    }

}
