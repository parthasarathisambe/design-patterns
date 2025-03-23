package com.design.patterns.o2_structural.bridge;

public class Fan implements Device {

  @Override
  public void turnOn() {
    System.out.println("Turning On the Fan.");
  }

  @Override
  public void turnOff() {
    System.out.println("Turning Off the Fan.");
  }

}
