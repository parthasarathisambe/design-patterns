package com.design.patterns.o2_structural.bridge;

public class AdvanceRemoteControl extends RemoteControl {

  public AdvanceRemoteControl(Device device) {
    super(device);
  }

  @Override
  void pressOnButton() {
    device.turnOn();
  }

  @Override
  void pressOffButton() {
    device.turnOff();
  }

}
