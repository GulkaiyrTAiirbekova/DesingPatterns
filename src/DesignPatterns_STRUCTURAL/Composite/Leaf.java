package src.DesignPatterns_STRUCTURAL.Composite;

public class Leaf implements Component {

    String name;
    double price;
    public Leaf(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice(){
        System.out.println(name + "price = " + this.price);
    }
}
