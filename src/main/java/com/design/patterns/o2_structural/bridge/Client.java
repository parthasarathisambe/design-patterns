package com.design.patterns.o2_structural.bridge;

public class Client {

  public void operateTv() {
    Device tv = new Tv();
    RemoteControl tvControl = new AdvanceRemoteControl(tv);
    tvControl.pressOnButton();
    tvControl.pressOffButton();
  }

  public void operateFan() {
    Device fan = new Fan();
    RemoteControl fanControl = new AdvanceRemoteControl(fan);
    fanControl.pressOnButton();
    fanControl.pressOffButton();
  }

}
