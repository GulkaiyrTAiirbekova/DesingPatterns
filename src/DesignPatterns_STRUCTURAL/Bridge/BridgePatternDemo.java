package DesignPatterns_STRUCTURAL.Bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgePatternDemo {
    public static void main(String [] args){
        List<Workshop> workshops1 = new ArrayList<>();
        workshops1.add(new Produce());
        workshops1.add(new Assemble());

        Vehicle bike = new Bike(workshops1);
        bike.manufacture();

        Vehicle car = new Car(workshops1);
        car.manufacture();
    }
}
