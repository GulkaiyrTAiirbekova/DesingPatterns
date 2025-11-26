package DesignPatterns_STRUCTURAL.Bridge;
//Abstraction  in BRIDGE Pattern

import java.util.List;
import java.util.ArrayList;

abstract class Vehicle {
    protected List<Workshop>workshops;

    protected Vehicle(List<Workshop>workShops)
    {
        this.workshops = new ArrayList<>(workShops);
    }
    abstract public void manufacture();
}

