
//Don't directly depend on concrete classes.
//Depend on interfaces or abstract classes so your code is flexible and easy to change.

public interface INotificationSender {
    void sendMessage(String message);
}
class EmailNotification implements  INotificationSender {
    public void sendMessage(String message) {
        System.out.println("Email sent to " + message);

    }
}

    class SmsNotification implements  INotificationSender{
        public void sendMessage(String message) {
            System.out.println(message);
        }
    }

    class WhatsappNotification implements  INotificationSender{
    public void sendMessage(String message) {
        System.out.println("Whatsapp sent to " + message);
    }

}