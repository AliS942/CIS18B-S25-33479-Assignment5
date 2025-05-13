public class TypeErasureExample {
    public static void demonstrate(Object obj) {
        if (obj instanceof Notification<?>) {
            System.out.println("This is a Notification, but we can't know the type T due to type erasure.");
        }
    }
}
