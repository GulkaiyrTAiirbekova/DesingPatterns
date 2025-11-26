package DesignPatterns_STRUCTURAL.Adapter;
import DesignPatterns_STRUCTURAL.Adapter.Printer;
import DesignPatterns_STRUCTURAL.Adapter.PrinterAdapter;

public class UsingAdapter {
    public static void main(String [] args){
        Printer printer = new PrinterAdapter();
        printer.print();
    }
}
