package AbstractFactoryPattern;

public class DemoAbstractFactory {
    public static void main(String[] args){
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(os.Name.contains("mac")){
            factory = new MacOSFactory();
        } else{
            factory = new WindowsFactory();
        }
        Application app = new Application(factory);
        return app;
    }
}
