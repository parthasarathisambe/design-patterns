package com.design.patterns.o3_behavioral.command;

public class RemoteControl {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }

  public void pressUndo() {
    command.undo();
  }

}
