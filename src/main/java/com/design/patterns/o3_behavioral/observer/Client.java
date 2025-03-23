package com.design.patterns.o3_behavioral.observer;

public class Client {

  public void updateObservers() {

    // create observers
    Observer phone1 = new PhoneDisplay("phone 1");
    Observer phone2 = new PhoneDisplay("phone 2");
    Observer window = new WindowDisplay();

    // create subject
    WeatherStation weatherStation = new WeatherStation();

    // add observers to the subject
    weatherStation.addObserver(phone1);
    weatherStation.addObserver(phone2);
    weatherStation.addObserver(window);

    weatherStation.setTemperature(21.3f); // notify all observers
    weatherStation.setTemperature(30.0f); // notify all observers

    weatherStation.removeObserver(phone1);
    weatherStation.notifyObservers(); // notify all observers except phone1

    weatherStation.setTemperature(27.8f); // notify all observers except phone1

  }

}
