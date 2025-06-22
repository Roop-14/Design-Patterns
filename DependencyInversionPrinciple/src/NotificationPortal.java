public class NotificationPortal {
    INotificationSender sender;
    NotificationPortal(INotificationSender sender) {
        this.sender = sender;
    }

    public void send(String message) {
        sender.sendMessage(message);
    }

    public static void main(String[] args) {
//        INotificationSender notification = //new EmailNotification();
//                new SmsNotification();
//        NotificationPortal portal = new NotificationPortal(notification);
//        portal.send("Hello World");



    }
}
