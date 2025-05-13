import java.util.ArrayList;
import java.util.List;

public class NotificationManager<T> {
    private List<Observer<T>> observers = new ArrayList<>();

    public void registerObserver(Observer<T> observer) {
        observers.add(observer);
    }

    public void sendNotification(Notification<T> notification) {
        for (Observer<T> observer : observers) {
            observer.update(notification);
        }
    }
}
