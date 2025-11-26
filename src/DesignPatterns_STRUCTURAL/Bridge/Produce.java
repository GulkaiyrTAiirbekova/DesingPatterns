package DesignPatterns_STRUCTURAL.Bridge;
//Concrete implementation 1 for Bridge Pattern

public class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}
