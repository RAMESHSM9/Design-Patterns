package Behavioural.Observer.StockObserver;

import java.util.Observable;

public interface Observer {

    public void notify(String stcokName, double price);
}
