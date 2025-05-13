public class SMSNotificationFactory implements NotificationFactory<String> {
    public Notification<String> createNotification(String content) {
        return new SMSNotification(content);
    }
}
