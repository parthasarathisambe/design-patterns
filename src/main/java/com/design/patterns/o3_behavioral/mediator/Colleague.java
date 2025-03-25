package com.design.patterns.o3_behavioral.mediator;

public abstract class Colleague {

  protected Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void receiveMessage(String message);

}
