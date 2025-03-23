package com.design.patterns.o3_behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

  private List<Observer> observers = new ArrayList<>();
  private float temperature;

  public void setTemperature(float temperature) {
    this.temperature = temperature;
    notifyObservers();
  }

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(temperature));
  }

}
