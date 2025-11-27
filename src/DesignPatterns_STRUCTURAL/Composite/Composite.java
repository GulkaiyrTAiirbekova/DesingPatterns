package src.DesignPatterns_STRUCTURAL.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    // ✅ This is essential
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void showPrice() {
        double total = 0;
        for (Component c : components) {
            c.showPrice();
            if (c instanceof Leaf leaf) {
                total += leaf.price;
            }
        }
        System.out.println("Total price of " + name + " = " + total);
    }
}
