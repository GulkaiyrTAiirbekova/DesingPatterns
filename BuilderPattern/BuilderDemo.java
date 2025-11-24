package BuilderPattern;

public class BuilderDemo {
    public static void main(String[] args) {

        // Shared foundation object
        Foundation commonFoundation = new Foundation();

        // House 1: Swimming Pool only
        House houseWithPool = new House.Builder()
                .buildFoundation(commonFoundation)
                .buildWalls(new Walls())
                .buildRoof(new Roof())
                .addSwimmingPool(new SwimmingPool())
                .build();

        // House 2: Garden only
        House houseWithGarden = new House.Builder()
                .buildFoundation(commonFoundation)
                .buildWalls(new Walls())
                .buildRoof(new Roof())
                .addGarden(new Garden())
                .build();

        // House 3: Fancy Statues only
        House houseWithStatues = new House.Builder()
                .buildFoundation(commonFoundation)
                .buildWalls(new Walls())
                .buildRoof(new Roof())
                .addFancyStatues(new FancyStatues())
                .build();

        System.out.println("House with Pool: " + houseWithPool);
        System.out.println("House with Garden: " + houseWithGarden);
        System.out.println("House with Statues: " + houseWithStatues);
    }
}