package com.design.patterns.o3_behavioral.observer;

public class PhoneDisplay implements Observer {

  private String name;

  public PhoneDisplay(String name) {
    this.name = name;
  }

  @Override
  public void update(float temperature) {
    System.out.println(name + " received temperature update, temperature is " + temperature + "°C");
  }

}
