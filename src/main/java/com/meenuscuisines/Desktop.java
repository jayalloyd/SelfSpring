package com.meenuscuisines;

public class Desktop implements  Computer {
public Desktop(){
    System.out.println("Desktop object created");
}
    @Override
    public void compile() {
        System.out.println("Code,compile using Desktop");
    }
}
