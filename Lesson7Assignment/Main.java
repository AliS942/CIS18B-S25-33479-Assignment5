public class Main {
    public static void main(String[] args) {
        // Build and send email notification
        NotificationBuilder<String> builder = new NotificationBuilder<>();
        EmailNotificationFactory emailFactory = new EmailNotificationFactory();
        Notification<String> email = builder.setContent("Welcome to MarketBridge!").build(emailFactory);

        // Build and send SMS notification
        SMSNotificationFactory smsFactory = new SMSNotificationFactory();
        Notification<String> sms = builder.setContent("Your order has shipped!").build(smsFactory);

        // Set up observers
        NotificationManager<String> manager = new NotificationManager<>();
        manager.registerObserver(new EmailObserver());
        manager.registerObserver(new SMSObserver());

        // Send notifications
        manager.sendNotification(email);
        manager.sendNotification(sms);

        // Demonstrate type erasure
        TypeErasureExample.demonstrate(email);

        // Example of generic array restriction
        // Notification<String>[] notifications = new Notification<String>[10]; // ❌ Compile-time error
        System.out.println("Note: Cannot create generic arrays like 'new Notification<String>[10]' due to type erasure.");
    }
}
