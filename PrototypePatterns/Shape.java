package PrototypePatterns;
import java.awt.Color;

public interface Shape {
    Shape clone();
    void draw();
}

class Circle implements Shape{
    private int x,y;
    private int radius;
    private Color color;

    //... constructor, getters,setters

    public Circle(){}

    public Circle (int x, int y,int radius, Color color){
        this.x= x;
        this.y =y;
        this.radius = radius;
        this.color= color;
    }
    // Getters and setters here (optional)
    @Override
    public Shape clone(){
        Circle clone = new Circle(); //we created new Circle
        clone.x = this.x;  // copied all the data
        clone.y = this.y;
        clone.radius = this.radius;
        clone.color = this.color;
        return clone;
    }

    //... draw method

    @Override
    public void draw(){
        System.out.println("Drawing a circle at (" +x +", " + y + ") with radius" + radius + " and color " + color);
    }
}
//Shape circle1 = new Circle(x1, y1,radius1, color1);
//Shape circle2 = circle1.clone();
//circle2.setRadius(10);
// instead of creating new circle we are just coping existing one and changing needed parameters