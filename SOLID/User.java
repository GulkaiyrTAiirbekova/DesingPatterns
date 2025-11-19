package SOLID;
//a  User class that handles both user properties and database logic
public class User {
    string name;
    string email;

    void saveUserToDatabase(){...}//Reason to change #1
    void sendWelcomeEmail{}{...} //Reason to chnage #2
}
//+SPLIT THE RESPONSIBILITIES
class User{
    string name;
    string email;
}
class UserRepository{
    void save(User user) {...} //only handles Database
}
class EmailService{
    void SendWelcome(User user){...}// only handles email
}
