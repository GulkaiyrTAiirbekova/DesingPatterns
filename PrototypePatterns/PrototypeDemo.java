package PrototypePatterns;

import java.awt.*;

public class PrototypeDemo {
    public static void main(String [] args){
        Shape circle1 = new Circle(5,5,20, Color.RED);
        circle1.draw();

        Shape circle2 = circle1.clone();
        circle2.draw();
    }
}
