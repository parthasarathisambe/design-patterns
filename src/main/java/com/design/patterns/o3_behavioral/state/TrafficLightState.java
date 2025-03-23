package com.design.patterns.o3_behavioral.state;

public interface TrafficLightState {

  void changeLight(TrafficLightContext context);

  void display();

}
