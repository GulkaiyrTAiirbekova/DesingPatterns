package FactoryPattern;

public interface DocumentFactory {
    Document createDocument();
}
class DocFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        return new DocDocument();
    }
}

class PdfFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        return new PDFDocument();
    }
}

