package FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args){


        //Using DOC factory
        DocumentFactory docFactory = new DocFactory();
        Document doc = docFactory.createDocument();
        doc.open();
        // Using PDF factory

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();


        // Example: dynamic selection
        openDocument("pdf");
        openDocument("doc");
    }
    // Helper for dynamic factory selection
    public static void openDocument(String type) {
        DocumentFactory factory;

        if ("pdf".equalsIgnoreCase(type)) {
            factory = new PdfFactory();
        } else if ("doc".equalsIgnoreCase(type)) {
            factory = new DocFactory();
        } else {
            throw new IllegalArgumentException("Unsupported document type: " + type);
        }

        Document document = factory.createDocument();
        document.open();
    }
}
