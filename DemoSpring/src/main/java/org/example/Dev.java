package org.example;

public class Dev {

    private Laptop laptop;
    private int age;

    public Dev(int age){
        this.age=age;
        System.out.println("Dev contructor");
    }

    public void setAge(int age){
        this.age=age;
        System.out.println("Dev Contructor");
    }

    public int getAge(){
        return age;
    }

    public Dev(Laptop laptop){
        this.laptop=laptop;
        System.out.println("Dev1 Constructor");
    }

    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }

    public void build(){
        System.out.println("Working on Awesome Project");
        laptop.compile();

    }

}
