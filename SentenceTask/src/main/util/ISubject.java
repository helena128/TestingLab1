package main.util;

public interface ISubject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();

    String describe();
}
