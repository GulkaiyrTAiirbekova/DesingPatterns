package FactoryPattern;

public interface Document {
    void open();
}

class DocDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening a DOC document");
    }
}

class PDFDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening a PDF document");
    }
}


