package com.design.patterns.o3_behavioral.chain_of_responsibility;

public abstract class SupportHandler {

  protected SupportHandler nextHandler;

//  public SupportHandler(SupportHandler nextHandler) {
//    this.nextHandler = nextHandler;
//  }

  public void setNextHandler(SupportHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public abstract void handleRequest(String issueType);

}
