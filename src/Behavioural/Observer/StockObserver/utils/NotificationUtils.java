package Behavioural.Observer.StockObserver.utils;

public class NotificationUtils {
    public static void sendEmail(String subject, String content) {
            System.out.println("Sending email"+subject+" content: "+content);
    }

    public static void sendSms(String subject, String content) {
        System.out.println("Sending SMS"+subject+" content: "+content);
    }

    public static void sendPush(String subject, String content) {
        System.out.println("Sending Push Notification"+subject+" content: "+content);
    }
}
