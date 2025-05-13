public class EmailObserver implements Observer<String> {
    @Override
    public void update(Notification<String> notification) {
        System.out.println("EmailObserver received: " + notification.getContent());
    }
}
