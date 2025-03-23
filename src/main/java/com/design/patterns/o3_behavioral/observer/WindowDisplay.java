package com.design.patterns.o3_behavioral.observer;

public class WindowDisplay implements Observer {

  @Override
  public void update(float temperature) {
    System.out.println("Window display received temperature update, temperature is " + temperature + "°C");
  }

}
