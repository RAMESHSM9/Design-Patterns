package Behavioural.Observer.WeatherObserver;

public interface ObserverRegistry {
    void addObserver(Observer observer); // Adds an observer

    void removeObserver(Observer observer); // Removes an observer

    void notifyObservers(double value); // Notifies all observers about a change in value
}
