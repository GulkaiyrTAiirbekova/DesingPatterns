package DesignPatterns_STRUCTURAL.Adapter;
import DesignPatterns_STRUCTURAL.Adapter.Printer;
import DesignPatterns_STRUCTURAL.Adapter.PrinterAdapter;


//Adaptee

public class LegacyPrinter {
    private String format; //  // field to store format

    // Setter for format
    public void setFormat(String format) {
        this.format = format;
    }

    // Prints the document

    public void printDocument(){
        System.out.println("Legacy Printer is printing a document in format: " + format);
    }
}
