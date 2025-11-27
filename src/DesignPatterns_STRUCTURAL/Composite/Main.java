package src.DesignPatterns_STRUCTURAL.Composite;

public class Main {
    public static void main(String[] args) {
        Component hdd = new Leaf("hdd", 4000);
        Component keyboard = new Leaf("keyboard", 1000);
        Component mouse = new Leaf("mouse", 500);
        Component ram = new Leaf("ram", 3000);
        Component processor = new Leaf("processor", 10000);

        Composite motherboard = new Composite("motherboard");
        motherboard.add(ram);
        motherboard.add(processor);

        Composite cabinet = new Composite("cabinet");
        cabinet.add(hdd);
        cabinet.add(motherboard);

        Composite peripherals = new Composite("peripherals");
        peripherals.add(keyboard);
        peripherals.add(mouse);

        Composite computer = new Composite("computer");
        computer.add(cabinet);
        computer.add(peripherals);

        computer.showPrice();
    }
}

