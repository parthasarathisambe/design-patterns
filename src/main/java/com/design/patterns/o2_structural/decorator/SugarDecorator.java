package com.design.patterns.o2_structural.decorator;

public class SugarDecorator extends CoffeeDecorator {

  SugarDecorator(Coffee coffee) {
    super(coffee);
  }

  public String make() {
    return super.make() + " + Sugar";
  }

  public double cost() {
    return super.cost() + 5.0;
  }
}
