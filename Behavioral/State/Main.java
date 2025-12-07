package Behavioral.State;

public class Main {
    public static void main(String [] args){
        Fan fan = new Fan();
        fan.requests(); //Turn on low
        fan.requests(); //Turn on medium
        fan.requests(); //Turn on high
        fan.requests(); //Turn on medium
        fan.requests(); //Turn on high

    }
}
