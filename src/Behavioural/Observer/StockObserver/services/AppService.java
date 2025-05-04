package Behavioural.Observer.StockObserver.services;

import Behavioural.Observer.StockObserver.Observer;
import Behavioural.Observer.StockObserver.utils.NotificationUtils;

public class AppService implements Observer {
    public void sendPush(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }

    @Override
    public void notify(String stcokName, double price) {
        sendPush(stcokName,price);
    }
}
