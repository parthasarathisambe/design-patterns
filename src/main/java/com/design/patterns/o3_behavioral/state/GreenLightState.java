package com.design.patterns.o3_behavioral.state;

public class GreenLightState implements TrafficLightState {

  @Override
  public void changeLight(TrafficLightContext context) {
    System.out.println("Changing light from Green to Yellow.");
    context.setState(new YellowLightState());
  }

  @Override
  public void display() {
    System.out.println("Green Light - GO!");
  }

}
