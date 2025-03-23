package com.design.patterns.o3_behavioral.state;

public class RedLightState implements TrafficLightState {

  @Override
  public void changeLight(TrafficLightContext context) {
    System.out.println("Changing light from Red to Green.");
    context.setState(new GreenLightState());
  }

  @Override
  public void display() {
    System.out.println("Red Light - STOP!");
  }

}
