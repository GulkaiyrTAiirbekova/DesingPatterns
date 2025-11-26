package DesignPatterns_STRUCTURAL.Bridge;
//Concrete implementation 2 for Bridge Pattern

public class Assemble implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Assembled");
    }
}
