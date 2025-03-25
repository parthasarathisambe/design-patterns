package com.design.patterns.o3_behavioral.template_method;

public class Tea extends Beverage {

  @Override
  protected void brew() {
    System.out.println("Steeping tea leaves.");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding lemon.");
  }

}
