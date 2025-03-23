package com.design.patterns.o2_structural.bridge;

public abstract class RemoteControl {

  protected Device device;

  public RemoteControl(Device device) {
    this.device = device;
  }

  abstract void pressOnButton();

  abstract void pressOffButton();

}
