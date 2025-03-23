package com.design.patterns.o3_behavioral.state;

public class YellowLightState implements TrafficLightState {

  @Override
  public void changeLight(TrafficLightContext context) {
    System.out.println("Changing light from Yellow to Red.");
    context.setState(new RedLightState());
  }

  @Override
  public void display() {
    System.out.println("Yellow Light - CAUTION!");
  }

}
