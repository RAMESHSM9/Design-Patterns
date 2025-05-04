package Behavioural.Observer.StockObserver.services;

import Behavioural.Observer.StockObserver.Observer;
import Behavioural.Observer.StockObserver.utils.NotificationUtils;

public class SmsService implements Observer {
    public void sendSMS(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }

    @Override
    public void notify(String stcokName, double price) {
        sendSMS(stcokName,price);
    }
}
