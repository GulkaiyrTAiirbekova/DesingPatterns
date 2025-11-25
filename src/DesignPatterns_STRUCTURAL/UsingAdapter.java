package DesignPatterns_STRUCTURAL;

public class UsingAdapter {
    public static void main(String [] args){
        Printer printer = new PrinterAdapter();
        printer.print();
    }
}
