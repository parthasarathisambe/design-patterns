package com.design.patterns.o3_behavioral.state;

public class TrafficLightContext {

  private TrafficLightState state;

  public TrafficLightContext() {
    state = new RedLightState();
  }

  public void setState(TrafficLightState state) {
    this.state = state;
  }

  public void changeLight() {
    state.changeLight(this);
  }

  public void display() {
    state.display();
  }

}
