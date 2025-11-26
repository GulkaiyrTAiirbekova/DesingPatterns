package BuilderPattern;
//
//public class House {
//    private Foundation foundation;
//    private Walls walls;
//    private Roof roof;
//    //... other properties
//
//    //Private constructor to enforce builder usage
//    private House(Builder builder){
//        this. foundation = foundation;
//        this.walls = walls;
//        this.roof = roof;
//    }
//    //Getters for accessing house components
//
//    public Foundation getFoundation() {
//        return foundation;
//    }
//    //other getters
//    public static class Builder{
//        private Foundation foundation;
//        private Walls walls;
//        private Roof roof;
//        //Setters for each component, returning the builder for chaining
//        public Builder buildFoundation(Foundation foundation){
//            this.foundation = foundation;
//            return this;
//        }
//        public Builder buildWalls(Walls walls){
//            this.walls = walls;
//            return this;
//        }
//        public Builder thisRoof(Roof roof){
//            this.roof = roof;
//            return this;
//        }
//
//        //... other setters
//
//        //Build method to create the House object
//
//        public House buld(){
//            return new House(this);
//        }
//    }
//    House modernHouse = new House.Builder()
//            .buildFoundation(new ConcreteFoundation())
//            .buildWalls(new BricksWalls())
//            .buildRoof(new FlatRoof())
//            .build();
//}


//Example component classes
class Foundation{}
class Walls{}
class Roof{}
class SwimmingPool{}
class Garden{}
class FancyStatues{}


public class House{
    private Foundation foundation;
    private Walls walls;
    private Roof roof;
    // Optional features

    private SwimmingPool swimmingPool;
    private Garden garden;
    private FancyStatues fancyStatues;


    // Private constructor: enforce Builder usage
     private House (Builder builder){
         this.foundation = builder.foundation;
         this.walls = builder.walls;
         this.roof = builder.roof;
         this.swimmingPool= builder.swimmingPool;
         this.garden = builder.garden;
         this.fancyStatues = builder.fancyStatues;
     }

     //Getters

    public Foundation getFoundation(){ return foundation;}
    public Walls getWalls(){ return walls; }
    public Roof getRoof() { return roof; }
    public SwimmingPool getSwimmingPool() { return swimmingPool; }
    public Garden getGarden() { return garden; }
    public FancyStatues getFancyStatues() { return fancyStatues; }

    @Override
    public String toString(){
         return "House{" +
                "foundation=" + foundation +
                ", walls=" + walls +
                ", roof=" + roof +
                ", swimmingPool=" + swimmingPool +
                 ", garden=" + (garden !=null) +
                 ", fancyStatues=" + (fancyStatues !=null) +
                 '}';
    }

    //Builder
    public static class Builder{
         private Foundation foundation;
         private Walls walls;
        private Roof roof;

        private SwimmingPool swimmingPool;
        private Garden garden;
        private FancyStatues fancyStatues;

        // Required components
        public Builder buildFoundation(Foundation foundation){
            this.foundation = foundation;
            return this;
        }

        public Builder buildWalls(Walls walls){
            this.walls = walls;
            return this;
        }
        public Builder buildRoof (Roof roof){
            this.roof = roof;
            return this;
        }
        // Optional features


        public Builder addSwimmingPool(SwimmingPool pool){
            this.swimmingPool = pool;
            return this;
        }
        public Builder addGarden(Garden garden){
            this.garden = garden;
            return this;
        }


        public Builder addFancyStatues(FancyStatues statues) {
            this.fancyStatues = statues;
            return this;
        }

        // Build method

        public House build(){
            return new House(this);
        }
    }

}