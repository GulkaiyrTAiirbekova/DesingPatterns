package DesignPatterns_CREATIONAL;

public class PrinterSingleton {
    private static PrinterSingleton instance;

    private PrinterSingleton(){
        //Private constructor to prevent direct instantiation
    }
    public static PrinterSingleton getInstance(){
        if(instance == null){
            instance = new PrinterSingleton();
        }
        return instance;
    }
    public void printDocument(String document){
        //Implementation to print the document
        System.out.println("Printing: " + document);
    }
}
//lazy loading, but it is not thread safe
