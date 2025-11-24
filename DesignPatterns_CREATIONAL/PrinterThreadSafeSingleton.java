package DesignPatterns_CREATIONAL;

//public class PrinterThreadSafeSingleton {
//    private static PrinterThreadSafeSingleton instance;
//    private PrinterThreadSafeSingleton(){
//
//    }
//    public static synchronized PrinterThreadSafeSingleton getInstance(){
//        if (instance == null){
//            instance = new PrinterThreadSafeSingleton();
//        }
//        return instance;
//    }
//}

//lazy loading, but synchronized method can decrease performance

public class PrinterThreadSafeSingleton {
    private static PrinterThreadSafeSingleton instance;
    private PrinterThreadSafeSingleton(){

    }
    public static synchronized PrinterThreadSafeSingleton getInstance(){
        if (instance == null){
            synchronized (PrinterThreadSafeSingleton.class){
                if(instance==null){
                    instance = new PrinterThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
//thread safe and performance-optimized, we are locking only on the first creation