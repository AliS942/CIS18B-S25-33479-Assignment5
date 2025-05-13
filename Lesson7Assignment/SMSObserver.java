public class SMSObserver implements Observer<String> {
    @Override
    public void update(Notification<String> notification) {
        System.out.println("SMSObserver received: " + notification.getContent());
    }
}
