//package SOLID.D_Dependepcy_Inversion_Principle;
////the high-level NotificationService directly depends on the low-level Email_sender. To use SMS, you must chnage NotificationService
//
//public class EmailSender { //Low-vele module
//    void sendEmail(string message){...}
//}
//class NotificationService { //Hight -level module
//    EmailSender emailSender = new EmailSender(); //Direct dependency
//
//    void sendNotification(string message){
//        emailSender.sendEmail(message);
//    }
//}

