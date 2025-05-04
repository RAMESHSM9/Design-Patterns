package Behavioural.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements ObserverRegistry{

    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void notifyObservers(String stockName, double currentPrice){
        for(Observer observer : observers){
            observer.notify(stockName, currentPrice);;
        }
    }

}
