package Behavioural.Observer.StockObserver.services;

import Behavioural.Observer.StockObserver.Observer;
import Behavioural.Observer.StockObserver.utils.NotificationUtils;

public class EmailService implements Observer {
    public void sendEmail(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }

    @Override
    public void notify(String stcokName, double price) {
        sendEmail(stcokName,price);
    }
}
