package com.kodilla.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void  notifyObserver();
    void removeObserver(Observer observer);
}
