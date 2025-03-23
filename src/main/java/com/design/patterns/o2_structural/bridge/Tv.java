package com.design.patterns.o2_structural.bridge;

public class Tv implements Device {

  @Override
  public void turnOn() {
    System.out.println("Turning On the TV.");
  }

  @Override
  public void turnOff() {
    System.out.println("Turning Off the TV.");
  }

}
