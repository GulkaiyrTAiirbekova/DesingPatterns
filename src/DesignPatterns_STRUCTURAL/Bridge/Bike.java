package DesignPatterns_STRUCTURAL.Bridge;

//Refines Abstraction 1

import java.util.List;

class Bike extends Vehicle{
    public Bike(List<Workshop> workshops){
        super(workshops);
    }
    @Override
    public void manufacture(){
        System.out.println("Bike");
        for(Workshop workshop : workshops){
            workshop.work();
        }
        System.out.println();
    }
}