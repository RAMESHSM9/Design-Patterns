package Behavioural.Observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements ObserverRegistry{

    List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public  void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(double value){
        for(Observer observer : observers){
            observer.updateOnCrossingThresold(value);
        }
    }
}
