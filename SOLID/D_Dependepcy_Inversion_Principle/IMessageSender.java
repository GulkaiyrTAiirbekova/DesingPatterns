//package SOLID.D_Dependepcy_Inversion_Principle;
////high-level modules should not depend on,low-leve; modules.Both should depend on abstarction (interface)
//
////+The NotificationService depends on an interface(abstarction)
////you can easily "inject"/insert any service(Email,SMS) that implements the interface
//interface IMessageSender {  //Abstraction
//    void sendMessage(string message);
//}
//class EmailSender implements IMessageSender{ //low-level module
//    void sendMessage(string message){...}
//}
//
//class SmsSender implements IMessageSender{ //Another low-level module
//    void sendMessage(string message){...}
//}
//class NotificationService {  //HIGH-LEVEL MODULE
//    IMessageSender sender;
//
//    //the dependency is "injected/inserted" via the constructor
//    NotificationService(IMessageSender sender){
//        this.sender = sender;
//    }
//    void sendNotification(string message){
//        sender.sendMessage(message); //DOESN'T KNOW OR CARE IF IT'S EMAIL OR SMS
//    }
//
//}
