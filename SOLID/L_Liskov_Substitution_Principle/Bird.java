//package SOLID.L_Liskov_Substitution_Principle;
//
//public class Bird {
//    void fly{...}
//}
//
//class Sparrow extends Bird{...}//works fine
//
//class Penguin extends Bird{
//    void fly(){
//        throw new Error("Penguins can't fly"); //Violates LSP
//    }
//}


// CREATE A MORE SPECIFIC ABSTRACTIONS.not all birds can fly
//class Bird{
//    void eat(){...}
//}
//class FlyingBird extends Bird{
//    void fle(){...}
//}
//class Sparrow extends FlyingBird{...}//Can be substituted for flyingBird or Bird
//class Penguin extends Bird{...} //Can be subsityuted for Bird, but not for FlyingBird
