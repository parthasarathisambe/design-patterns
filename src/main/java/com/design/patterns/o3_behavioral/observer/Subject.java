package com.design.patterns.o3_behavioral.observer;

public interface Subject {

  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();

}
