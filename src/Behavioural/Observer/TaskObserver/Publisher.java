package Behavioural.Observer.TaskObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher{

    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public  void removeObserver(Observer observer){
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public void notifyObservers(Long taskId, Long userId){
        for(Observer observer : observers) {
            observer.onTaskCreation(taskId, userId);
        }
    }
}
