package com.design.patterns.o3_behavioral.mediator;

public class Aircraft extends Colleague {

  private String name;

  public Aircraft(String name, Mediator mediator) {
    super(mediator);
    this.name = name;
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println(name + ": Received message: " + message);
  }

  public void sendMessage(String message) {
    System.out.println(name + ": Sending message: " + message);
    mediator.sendMessage(message, this);
  }
}
