package com.design.patterns.o3_behavioral.command;

public class Client {

  public void operateHomeAppliances() {

    // create receivers
    Light livingRoomLight = new Light();
    Fan ceilingFan = new Fan();

    // create commands
    Command lightOn = new LightOnCommand(livingRoomLight);
    Command lightOff = new LightOffCommand(livingRoomLight);
    Command fanOn = new FanOnCommand(ceilingFan);
    Command fanOff = new FanOffCommand(ceilingFan);

    // create the invoker
    RemoteControl remote = new RemoteControl();

    // turn the light on
    remote.setCommand(lightOn);
    remote.pressButton(); // Light is On
    remote.pressUndo(); // Light is Off

    // turn the fan off
    remote.setCommand(fanOff);
    remote.pressButton(); // Fan is Off
    remote.pressUndo(); // Fan is On

  }

}
