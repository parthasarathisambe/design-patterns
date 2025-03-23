package com.design.patterns.o2_structural.decorator;

public class PlainCoffee implements Coffee {

  @Override
  public String make() {
    return "Making Coffee";
  }

  @Override
  public double cost() {
    return 20.0;
  }

}
