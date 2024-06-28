package com.meenuscuisines;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
//    private Computer desktop;
//    private Computer laptop;
private Computer com;
    public Alien(){
        System.out.println("object create");
    }
    public Alien(int age,Computer com) {
        this.age=age;
//        this.laptop=laptop;
//        this.desktop=desktop;
    }

//    public Computer getLaptop() {
//        return laptop;
//    }

//    public void setLaptop(Computer laptop) {
//        this.laptop = laptop;
//    }
//
//    public Computer getDesktop() {
//        return desktop;
//    }
//
//    public void setDesktop(Computer desktop) {
//        this.desktop = desktop;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
       com.compile();
        System.out.println("coding using alien");
    }
}
