package com.design.patterns.o3_behavioral.state;

public class Client {

  public void manageTraffic() {

    TrafficLightContext trafficLight = new TrafficLightContext();

    trafficLight.display(); // Output: Red Light - STOP!
    trafficLight.changeLight();

    trafficLight.display(); // Output: Green Light - GO!
    trafficLight.changeLight();

    trafficLight.display(); // Output: Yellow Light - CAUTION!
    trafficLight.changeLight();

    trafficLight.display(); // Output: Red Light - STOP!

  }

}
