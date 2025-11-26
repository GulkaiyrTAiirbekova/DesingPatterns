package DesignPatterns_STRUCTURAL.Bridge;
//Refine abstraction 1 in Bridge Pattern

import java.util.List;

public class Car extends Vehicle {
    public Car(List<Workshop> workShops) {
        super(workShops);
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        for (Workshop workshop : workshops) {
            workshop.work();
        }
        System.out.println(); // ✔ now inside the method
    }
}
