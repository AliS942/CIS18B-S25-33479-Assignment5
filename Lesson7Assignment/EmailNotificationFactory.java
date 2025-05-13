public class EmailNotificationFactory implements NotificationFactory<String> {
    public Notification<String> createNotification(String content) {
        return new EmailNotification(content);
    }
}
