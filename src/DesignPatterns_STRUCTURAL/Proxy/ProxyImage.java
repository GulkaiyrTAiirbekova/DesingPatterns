package src.DesignPatterns_STRUCTURAL.Proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    public String filename;
    public ProxyImage(String filename){
        this.filename = filename;
    }
    public void display(){
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
