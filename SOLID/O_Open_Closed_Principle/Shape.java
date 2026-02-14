//package SOLID.O_Open_Closed_Principle;
//+USE AN INTERFACE OR ABSTARCT CLASS. YOU CAN ADD A TRIANGLE CLASS WITHOUt TOUCHING AreaCalculator
//
//public interface Shape {
//    double getArea();
//}
//
//class Rectangle implements Shape {
//    double gerArea(){return width * height;}
//}
//class Circle implements Shape{
//    double getArea(){retunr 3.14 *radius * radius;}
//}
//this class in now "closed" for modification/change
//class AreaCalculator(Shape shape){
//    return shape.getArea();
//}